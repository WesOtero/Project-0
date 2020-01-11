package com.revature.pojo;

public class User {
	private String userName;
	private String password;
	//Since user policy shouldn't be limited to just Emp or Cust I made it a string and not a boolean, 
	//There is an ENUM that defines these policies
	private String userPolicy;

	public User() {

	}

	public User(String userName, String password, String userPolicy) {
		super();
		this.userName = userName;
		this.password = password;
		this.userPolicy = userPolicy;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserPolicy() {
		return userPolicy;
	}

	public void setUserPolicy(String userPolicy) {
		this.userPolicy = userPolicy;
	}

}
