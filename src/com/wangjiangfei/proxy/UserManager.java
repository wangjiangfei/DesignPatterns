package com.wangjiangfei.proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

public class UserManager {

    /**
     * 根据部门编号来获取该部门下的所有人员
     * @param depId 部门编号
     * @return 该部门下的所有人员
     */
    public Collection<UserModelApi> getUserByDepId(String depId) throws Exception {
        Collection<UserModelApi> col = new ArrayList<>();
        Connection conn = null;
        try {
            conn = this.getConnection();
            // 只需要查询userId和name两个值就可以了
            String sql = "SELECT u.userId, u.name FROM tbl_user u, tbl_dep d "
                    + "WHERE u.depId = d.depId AND d.depId like ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, depId + "%");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                // 这里是创建的代理对象，而不是直接创建UserModel的对象
                Proxy proxy = new Proxy(new UserModel());
                // 只是设置userId和name两个值就可以了
                proxy.setUserId(rs.getString("userId"));
                proxy.setName(rs.getString("name"));
                col.add(proxy);
            }
            rs.close();
            pst.close();
        } finally {
            conn.close();
        }

        return col;
    }

    /**
     * 获取与数据库的连接
     * @return
     * @throws Exception
     */
    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "12345");
    }
}
