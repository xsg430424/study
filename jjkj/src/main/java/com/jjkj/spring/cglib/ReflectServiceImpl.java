package com.jjkj.spring.cglib;

public class ReflectServiceImpl {
	
	public void sayHello(String name){
		System.out.println("Hello "+name);
	}
	
	public ReflectServiceImpl getInstance(){
		ReflectServiceImpl object=null;
		try {
			object = (ReflectServiceImpl)Class.forName("com.jjkj.spring.fanshe.ReflectServiceImpl").newInstance();
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
	
	
	public static void main(String[] args) {
		ReflectServiceImpl r=new ReflectServiceImpl().getInstance();
		System.out.println(r);
		
	}
}
