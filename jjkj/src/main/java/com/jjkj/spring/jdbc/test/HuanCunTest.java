package com.jjkj.spring.jdbc.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jjkj.spring.jdbc.bean.CountRole;
import com.jjkj.spring.jdbc.bean.Role;
import com.jjkj.spring.jdbc.dao.RoleMapper;

public class HuanCunTest {
	ApplicationContext ctx;
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("spring-cfg.xml");
	}
	@Test
	public void test8(){
		String resource = "SqlMapConfig.xml";
		// 得到配置文件流
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		// 创建会话工厂，传入mybatis的配置文件信息
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
 
		// 通过工厂得到SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		RoleMapper mapper=sqlSession.getMapper(RoleMapper.class);
		Role role=mapper.select("c3613708-6d16-4010-a39b-1e5ce96e28a4");
		Role role0=mapper.select("c3613708-6d16-4010-a39b-1e5ce96e28a4");
		System.out.println(role);
		System.out.println(role==role0);
		
		SqlSession sqlSession1 = sqlSessionFactory.openSession();
		RoleMapper mapper1=sqlSession1.getMapper(RoleMapper.class);
		Role role1=mapper1.select("c3613708-6d16-4010-a39b-1e5ce96e28a4");
		sqlSession1.commit();
		System.out.println("info....");
		SqlSession sqlSession2 = sqlSessionFactory.openSession();
		RoleMapper mapper2=sqlSession1.getMapper(RoleMapper.class);
		Role role2=mapper2.select("c3613708-6d16-4010-a39b-1e5ce96e28a4");
		sqlSession2.commit();
		System.out.println(role1==role2);
		
		
		//
		CountRole countRole=new CountRole();
		SqlSession sqlSession3 = sqlSessionFactory.openSession();
		RoleMapper mapper3=sqlSession3.getMapper(RoleMapper.class);
		countRole.setRoleName("abc");
		
		mapper3.countRole(countRole);
		System.out.println(countRole.getTotal());
		System.out.println(countRole.getExecDate());
		
	}
	
}
