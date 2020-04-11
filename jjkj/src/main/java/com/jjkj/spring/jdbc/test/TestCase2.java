package com.jjkj.spring.jdbc.test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jjkj.spring.jdbc.bean.Role;
import com.jjkj.spring.jdbc.dao.RoleMapper;
import com.jjkj.spring.jdbc.dao.RoleMapper2;
import com.jjkj.spring.jdbc.dao.RoleMapper3;


public class TestCase2 {
	ApplicationContext ctx;
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("spring-cfg.xml");
	}
	@Test
	public void test1(){
		SqlSessionTemplate sst=ctx.getBean(SqlSessionTemplate.class);
		Role role=new Role();
		role.setId(UUID.randomUUID().toString());
		role.setRoleName("role_name_sst");
		role.setNote("note_sst");
		sst.insert("com.jjkj.spring.jdbc.dao.RoleDAO.insert", role);
		Role r =sst.selectOne("com.jjkj.spring.jdbc.dao.RoleDAO.select", role.getId());
		System.out.println(r);
		role.setNote("note_update");
		sst.update("com.jjkj.spring.jdbc.dao.RoleDAO.update", role);
		Role r1 =sst.selectOne("com.jjkj.spring.jdbc.dao.RoleDAO.select", role.getId());
		System.out.println(r1);
		sst.delete("com.jjkj.spring.jdbc.dao.RoleDAO.delete", r1.getId());
		
	}
	@Test
	public void test2(){
		RoleMapper roleMapper=ctx.getBean(RoleMapper.class);
		Role role=roleMapper.select("c3613708-6d16-4010-a39b-1e5ce96e28a4");
		System.out.println(role);
	}
	@Test
	public void test3(){
		RoleMapper2 roleMapper2=ctx.getBean(RoleMapper2.class);
		Role role=roleMapper2.select("c3613708-6d16-4010-a39b-1e5ce96e28a4");
		System.out.println(role);
	}
	@Test
	public void test4(){
		RoleMapper3 roleMapper3=ctx.getBean(RoleMapper3.class);
		Role role=roleMapper3.select("c3613708-6d16-4010-a39b-1e5ce96e28a4");
		System.out.println(role);
	}
	@Test
	public void test5(){
		RoleMapper roleMapper=ctx.getBean(RoleMapper.class);
		List<Role> roles=roleMapper.findRolesByName("sst");
		System.out.println(roles);
		List<Role> roles1=roleMapper.findRolesByNameNote("abc","123");
		System.out.println(roles1);
	}
	@Test
	public void test6(){
		Role role=new Role();
//		role.setId("bf25e70b-d779-432f-8b90-c0764d4d");
//		role.setRoleName("role_name_ssts");
		role.setNote("note");
		RoleMapper roleMapper=ctx.getBean(RoleMapper.class);
		List<Role> roles=roleMapper.findRoles(role);
		System.out.println(roles);
	}
	@Test
	public void test7(){
		List<String> list=new ArrayList<String>();
		list.add("role_name_sst");
		list.add("role_name_sst3");
		list.add("role_name_sst5");
		RoleMapper roleMapper=ctx.getBean(RoleMapper.class);
		List<Role> roles=roleMapper.findRolesByRoleNames(list);
		System.out.println(roles);
	}

}
