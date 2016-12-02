package com.andywooh.springboot4web.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(locations = "classpath:userinfo.properties")
public class UserInfo {
	private String userName;
	private String userPassword;
	private String userAddr;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserAddr() {
		return userAddr;
	}
	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", userPassword=" + userPassword + ", userAddr=" + userAddr + "]";
	}
	
	
}
