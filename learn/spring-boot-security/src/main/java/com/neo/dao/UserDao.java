package com.neo.dao;

import com.neo.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @des TODO
 * @date 2019/6/26 23:18
 * @auther xiaoshuigeng
 */
public interface UserDao extends JpaRepository<UserInfo,Long> {
    UserInfo findByUsername(String username);
}
