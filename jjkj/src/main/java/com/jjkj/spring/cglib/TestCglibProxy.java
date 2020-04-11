package com.jjkj.spring.cglib;

public class TestCglibProxy {
	public static void main(String[] args) {
		CglibProxyExample cpe=new CglibProxyExample();
		ReflectServiceImpl obj=(ReflectServiceImpl)cpe.getProxy(ReflectServiceImpl.class);
		obj.sayHello("张三");
	}
}
