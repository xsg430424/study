package com.jjkj.spring.jdbc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jjkj.spring.jdbc.annotation.MyRepository;
import com.jjkj.spring.jdbc.bean.Role;
@MyRepository
public interface RoleMapper2 {
	public int insert(Role role);
	public Role select(@Param("id") String id);
	public int update(Role role);
	public int delete(@Param("id") String id);
//	public List<Role> list(@Param("id") Long id);
}
