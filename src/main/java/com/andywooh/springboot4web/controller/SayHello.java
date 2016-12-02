package com.andywooh.springboot4web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andywooh.springboot4web.bean.UserInfo;

@RestController
@EnableAutoConfiguration
@RequestMapping("/demo")
public class SayHello {
	
	/**
	 * 读取properties文件中的属性
	 */
	@Value("${description}")
	private String description;
	
	@Autowired
	private UserInfo userInfo;
	
	
	@RequestMapping("/say-hello")
	public String sayHello(@RequestParam("name") String name) {
		System.out.println(userInfo.toString());
		return "Hello, " + name;
	}
	
}