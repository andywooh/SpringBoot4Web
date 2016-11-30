package com.andywooh.springboot4web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/demo")
public class SayHello {
	
	@RequestMapping("/say-hello")
	public String sayHello(@RequestParam("name") String name) {
		return "Hello, " + name;
	}
	
//	public static void main(String[] args) throws Exception {
//		SpringApplication.run(SayHello.class);
//	}
}