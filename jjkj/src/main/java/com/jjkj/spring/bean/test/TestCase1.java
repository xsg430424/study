package com.jjkj.spring.bean.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jjkj.spring.bean.domain.JuiceMaker;
import com.jjkj.spring.bean.domain.Role;
import com.jjkj.spring.bean.domain.UserRoleAssembly;


public class TestCase1 {
	ApplicationContext ctx;
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("spring-bean.xml");
	}
	@Test
	public void test0(){
		JuiceMaker juiceMaker=ctx.getBean("juiceMaker",JuiceMaker.class);
		juiceMaker.makeJuice();
	}
	@Test
	public void test1(){
		Role role=ctx.getBean("role",Role.class);
		System.out.println(role.getRoleName());
	}
	@Test
	public void test2(){
		Role role2=ctx.getBean("role2",Role.class);
		System.out.println(role2.getRoleName());
	}
	@Test
	public void test3(){
		Role role3=ctx.getBean("role3",Role.class);
		System.out.println(role3.getRoleName());
	}
	@Test
	public void test4(){
		Role role4=ctx.getBean("role4",Role.class);
		System.out.println(role4.getRoleName());
	}
	
	@Test
	public void test5(){
		UserRoleAssembly userRoleAssembly=ctx.getBean("userRoleAssembly",UserRoleAssembly.class);
		System.out.println(userRoleAssembly);
	}
}
