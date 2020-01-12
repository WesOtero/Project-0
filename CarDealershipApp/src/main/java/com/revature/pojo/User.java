package com.revature.pojo;

public class User {
	private String username;
	private String password;
	//Since user policy shouldn't be limited to just Emp or Cust I made it a string and not a boolean, 
	//There is an ENUM that defines these policies
	private UserPolicy userPolicy;

	public User() {

	}

	public User(String username, String password, UserPolicy userPolicy) {
		super();
		this.username = username;
		this.password = password;
		this.userPolicy = userPolicy;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserPolicy getUserPolicy() {
		return userPolicy;
	}

	public void setUserPolicy(UserPolicy userPolicy) {
		this.userPolicy = userPolicy;
	}

}
