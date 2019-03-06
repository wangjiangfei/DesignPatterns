package com.wangjiangfei.simpleFactory;

public class ImplB implements Api {

	@Override
	public void operation(String s) {
		System.out.println("ImplB s = " + s);
	}

}
