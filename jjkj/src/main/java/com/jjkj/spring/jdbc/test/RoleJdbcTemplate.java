package com.jjkj.spring.jdbc.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jjkj.spring.jdbc.bean.Role;

public class RoleJdbcTemplate {
	private Role role;
	private String sql;
	
	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-cfg.xml");
		JdbcTemplate template=ctx.getBean(JdbcTemplate.class);
		
		RoleJdbcTemplate t=new RoleJdbcTemplate();
		System.out.println(t.insert(template));
		
		Role role=new Role();
		role.setId("3");
		role.setRoleName("role_name_3");
		role.setNote("note_3");
		System.out.println(t.update(role, template));
		
		System.out.println(t.delete(3L, template));
		
		System.out.println(t.list(template, "role_name"));
	}
	public int insert(JdbcTemplate template){
		sql="insert into t_role (id,role_name,note) value(?,?,?)";
		return template.update(sql,3L,"role_name_3","note_3");
	}
	
	public int update(Role role,JdbcTemplate template){
		sql="update t_role set role_name=?,note=? where id=?";
		return  template.update(sql,role.getRoleName(),role.getNote(),role.getId());
	}
	public int delete(Long id,JdbcTemplate template){
		sql="delete from t_role where id=?";
		return template.update(sql,id);
	}
	public List<Role> list(JdbcTemplate template,String roleName){
		sql="select * from t_role where role_name like concat('%',?,'%')";
		Object[] params={roleName};
		List<Role> list=template.query(sql,params,new RowMapper<Role>(){

			@Override
			public Role mapRow(ResultSet rs, int rownum) throws SQLException {
				Role r=new Role();
				r.setId(rs.getString("id"));
				r.setRoleName(rs.getString("role_name"));
				r.setNote(rs.getString("note"));
				return r;
			}});
		return list;
	}
}
