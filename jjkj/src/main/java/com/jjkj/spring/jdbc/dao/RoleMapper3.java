package com.jjkj.spring.jdbc.dao;

import org.apache.ibatis.annotations.Param;
import com.jjkj.spring.jdbc.base.BaseMapper;
import com.jjkj.spring.jdbc.bean.Role;

public interface RoleMapper3 extends BaseMapper{
	public int insert(Role role);
	public Role select(@Param("id") String id);
	public int update(Role role);
	public int delete(@Param("id") String id);
//	public List<Role> list(@Param("id") Long id);
}
