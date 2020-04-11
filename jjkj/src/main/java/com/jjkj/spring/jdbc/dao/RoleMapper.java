package com.jjkj.spring.jdbc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jjkj.spring.jdbc.annotation.MyRepository;
import com.jjkj.spring.jdbc.bean.CountRole;
import com.jjkj.spring.jdbc.bean.Role;
@MyRepository
public interface RoleMapper {
	public int insert(Role role);
	public Role select(@Param("id") String id);
	public int update(Role role);
	public int delete(@Param("id") String id);
	public List<Role> findRolesByName(@Param("name") String name);
	public List<Role> findRolesByNameNote(@Param("name") String name,@Param("note") String note);
	public List<Role> findRoles(Role role);
	public List<Role> findRolesByRoleNames(List<String> names);
	public void countRole(CountRole countRole);
}
