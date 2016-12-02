package com.andywooh.springboot4web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andywooh.springboot4web.bean.UserInfo;

@RestController
@EnableAutoConfiguration
@RequestMapping("/demo")
public class SayBye {
	
	@RequestMapping("/say-bye")
	public String sayBye(@RequestParam("name") String name) {
		return "Bye, " + name;
	}
}