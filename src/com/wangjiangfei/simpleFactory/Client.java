package com.wangjiangfei.simpleFactory;

public class Client {
	
	public static void main(String[] args) {
		// 通过简单工厂来获取接口对象
		Api api = Factory.createApi();
		api.operation("正在使用简单工厂");
	}

}
