package com.jjkj.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jjkj.spring.annotation.pojo.Person;
import com.jjkj.spring.annotation.pojo.PojoConfig;


public class TestCase1 {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(PojoConfig.class);
		Person p=ac.getBean(Person.class);
		System.out.println(p.getId());
	}
}
