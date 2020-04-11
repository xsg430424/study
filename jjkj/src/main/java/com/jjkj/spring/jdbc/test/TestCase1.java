package com.jjkj.spring.jdbc.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jjkj.spring.jdbc.bean.Role;

public class TestCase1 {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-cfg.xml");
		JdbcTemplate jdbcTemplate=ctx.getBean(JdbcTemplate.class);
		Long id=1L;
		String sql="select id,role_name,note from t_role where id= "+id;
		Role role=jdbcTemplate.queryForObject(sql, new RowMapper<Role>(){

			@Override
			public Role mapRow(ResultSet rs, int rownum) throws SQLException {
				Role role=new Role();
				role.setId(rs.getString("id"));
				role.setRoleName(rs.getString("role_name"));
				role.setNote(rs.getString("note"));
				return role;
			}
			
		});
		System.out.println(role.getRoleName());
	}
}
