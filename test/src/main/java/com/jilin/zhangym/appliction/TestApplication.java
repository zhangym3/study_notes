package com.jilin.zhangym.appliction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.jilin.zhangym.service.UserService;

@SpringBootApplication
@ComponentScan(value = {
		"com.jilin.zhangym.controller",
		"com.jilin.zhangym.dconfig",
		"com.jilin.zhangym.datasource",
		"com.jilin.zhangym.service",
})
@MapperScan("com.jilin.zhangym.mapper")
public class TestApplication {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SpringApplication.run(TestApplication.class, args);

	}

}
