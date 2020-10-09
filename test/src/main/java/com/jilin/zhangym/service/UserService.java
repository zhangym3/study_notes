package com.jilin.zhangym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jilin.zhangym.bo.User;
import com.jilin.zhangym.datasource.DataSourceSelector;
import com.jilin.zhangym.datasource.DynamicDataSourceEnum;
import com.jilin.zhangym.mapper.UserMapper;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @DataSourceSelector(value = DynamicDataSourceEnum.SLAVE)
    public List<User> listUser() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    @DataSourceSelector(value = DynamicDataSourceEnum.MASTER)
    public Integer update() {
        User user = new User();
        user.setUser_id(Long.parseLong("1196978513958141952"));
        user.setUser_name("修改后的名字3");
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @DataSourceSelector(value = DynamicDataSourceEnum.SLAVE)
    public User find() {
        User user = new User();
        user.setUser_id(Long.parseLong("1196978513958141952"));
        return userMapper.selectByPrimaryKey(user);
    }
}