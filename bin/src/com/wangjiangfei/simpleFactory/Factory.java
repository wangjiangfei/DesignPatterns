package com.wangjiangfei.simpleFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 工厂类，用来创建Api对象
 * @author wangjiangfei
 *
 */
public class Factory {
	
	/**
	 * 构造方法私有化
	 */
	private Factory() {
		
	}
		
	/**
	 * 具体创建Api对象的方法
	 * @return
	 */
	public static Api createApi() {
		// 直接读取配置文件来获取需要创建实例的类
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = Factory.class.getResourceAsStream("factory.properties");
			p.load(in);
		} catch (IOException e) {
			System.out.println("装配工厂配置文件出错了，具体的堆栈信息如下：");
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 反射
		Api api = null;
		try {
			api = (Api) Class.forName(p.getProperty("ImplClass")).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return api;
	}

}
