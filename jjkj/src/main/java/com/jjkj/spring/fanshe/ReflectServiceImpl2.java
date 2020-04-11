package com.jjkj.spring.fanshe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectServiceImpl2 {
	private String name;
	public ReflectServiceImpl2() {
		// TODO Auto-generated constructor stub
	}
	public ReflectServiceImpl2(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello(String name){
		System.out.println("Hello "+name);
	}
	public ReflectServiceImpl2 getInstance(){
		ReflectServiceImpl2 object=null;
		try {
			try {
				object = (ReflectServiceImpl2)Class.forName("com.jjkj.spring.fanshe.ReflectServiceImpl2").getConstructor(String.class).newInstance("张三");
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
	
	@Override
	public String toString() {
		return "ReflectServiceImpl2 [name=" + name + "]";
	}
	public static void main(String[] args) {
		ReflectServiceImpl2 r=new ReflectServiceImpl2().getInstance();
		System.out.println(r);
	}
}
