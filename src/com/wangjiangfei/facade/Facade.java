package com.wangjiangfei.facade;


/**
 * 外观对象
 * @author wangjiangfei
 *
 */
public class Facade {
	
	/**
	 * 满足Client需要的功能
	 */
	public void test() {
		AModuleApi a = new AModuleImpl();
		a.testA();
		BModuleApi b = new BModuleImpl();
		b.testB();
		CModuleApi c = new CModuleImpl();
		c.testC();
	}

}
