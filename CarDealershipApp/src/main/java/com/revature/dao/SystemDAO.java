package com.revature.dao;

public final class SystemDAO {
	private static String systemPassword = "root";
	
	SystemDAO() {
		super();
	}

	public static String getSystemPassword() {
		return systemPassword;
	}

	public static void setSystemPassword(String systemPassword) {
		SystemDAO.systemPassword = systemPassword;
	}
	
}
