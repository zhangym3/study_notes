package com.jilin.zhangym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jilin.zhangym.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String sayHello1() {
		
		return service.listUser().toString();
	}
	
	
	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public String sayHello2() {
		
		return service.find().toString();
	}
	
	
	@RequestMapping(value = "/hello3", method = RequestMethod.GET)
	public String sayHello3() {
		service.update();
		return "success";
	}
}
