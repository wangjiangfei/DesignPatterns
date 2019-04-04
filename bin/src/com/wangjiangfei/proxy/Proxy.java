package com.wangjiangfei.proxy;

import java.sql.*;

/**
 * 代理对象，代理用户数据对象
 *
 * @author wangjiangfei
 */
public class Proxy implements UserModelApi {

    /**
     * 持有被代理的具体的目标对象
     */
    private UserModel realSubject = null;

    /**
     * 构造方法，传入被代理的具体的目标对象
     * @param realSubject 被代理的具体的目标对象
     */
    public Proxy(UserModel realSubject) {
        this.realSubject = realSubject;
    }

    /**
     * 标识是否已经重新装载过数据了
     *
     * 用户编号和姓名是已经获取到的数据，直接调用具体目标对象的数据就可以了
     */
    private boolean loaded = false;

    @Override
    public String getUserId() {
        return realSubject.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    @Override
    public String getName() {
        return realSubject.getName();
    }

    @Override
    public void setName(String name) {
        realSubject.setName(name);
    }


    @Override
    public void setDepId(String depId) {
        realSubject.setDepId(depId);
    }

    @Override
    public void setSex(String sex) {
        realSubject.setSex(sex);
    }

    @Override
    public String getDepId() {
        // 需要判断是否已经装载过了
        if (!this.loaded) {
            // 从数据库中重新装载
            reload();
            // 设置重新装载的标志为true
            loaded = true;
        }
        return realSubject.getDepId();
    }

    @Override
    public String getSex() {
        if (!this.loaded) {
            reload();
            this.loaded = true;
        }
        return realSubject.getSex();
    }

    /**
     * 重新查询数据库以获取完整的用户数据
     */
    private void reload() {
        System.out.println("重新查询数据库获取完整的用户数据，userId=" +
                realSubject.getUserId());

        Connection conn = null;
        try {
            conn = this.getConnection();
            String sql = "SELECT * FROM tbl_user "
                    + "WHERE userId = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, realSubject.getUserId());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                // 只需要重新获取除了userId和name外的数据
                realSubject.setDepId(rs.getString("depId"));
                realSubject.setSex(rs.getString("sex"));
            }
            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userId='" + getUserId() + '\'' +
                ", name='" + getName() + '\'' +
                ", depId='" + getDepId() + '\'' +
                ", sex='" + getSex() + '\'' +
                '}';
    }

    /**
     * 获取与数据库的连接
     * @return
     * @throws Exception
     */
    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "12345");
    }
}
