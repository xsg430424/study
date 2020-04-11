package com.jjkj.spring.daili;

public class TestJdkProxy {
	public static void main(String[] args) {
		JdkProxyExample jdk=new JdkProxyExample();
		HelloWorld proxy=(HelloWorld)jdk.bind(new HelloWorldImpl());
		proxy.sayHelloWorld();
	}
}
