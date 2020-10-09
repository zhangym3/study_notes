package com.jilin.zhangym.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jilin.zhangym.appliction.TestApplication;
import com.jilin.zhangym.bo.User;
import com.jilin.zhangym.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void listUser() {
        List<User> users = userService.listUser();
        for (User user : users) {
            System.out.println(user.getUser_id());
            System.out.println(user.getUser_name());
            System.out.println(user.getUser_phone());
        }
    }
    @Test
    public void update() {
        userService.update();
        User user = userService.find();
        System.out.println(user.getUser_name());
    }
}