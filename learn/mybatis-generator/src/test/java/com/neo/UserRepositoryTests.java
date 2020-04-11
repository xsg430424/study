//package com.neo;
//
//import com.neo.entity.User;
//import com.neo.repository.UserRepository;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.text.DateFormat;
//import java.util.Date;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class UserRepositoryTests {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Test
//    public void test() throws Exception {
//        Date date = new Date();
//        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
//        String formattedDate = dateFormat.format(date);
//
//        userRepository.save(new User(1L, "aa@126.com", "aa", "aa123456",formattedDate));
//        userRepository.save(new User(2L, "bb@126.com", "bb", "bb123456",formattedDate));
//        userRepository.save(new User(3L, "cc@126.com", "cc", "cc123456",formattedDate));
//
//        Assert.assertEquals(9, userRepository.findAll().size());
//        Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@126.com").getNickName());
//        userRepository.delete(userRepository.findByUserName("aa1"));
//    }
//
//}