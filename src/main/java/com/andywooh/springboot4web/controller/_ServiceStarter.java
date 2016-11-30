package com.andywooh.springboot4web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 该类用于启动多个Controller
 * @author wuuuxjia
 *
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class _ServiceStarter {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(_ServiceStarter.class);
	}
}