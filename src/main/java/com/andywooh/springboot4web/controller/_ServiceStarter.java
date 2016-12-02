package com.andywooh.springboot4web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.andywooh.springboot4web.bean.UserInfo;

/**
 * 该类用于启动多个扫描到的Controller
 * @author wuuuxjia
 *
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableConfigurationProperties({UserInfo.class})
public class _ServiceStarter {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(_ServiceStarter.class);
	}
}