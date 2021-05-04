package in.irctcapp;

import java.util.HashMap;

public class Registration {
	static HashMap<String, String> loginList = new HashMap<String, String>();
	static {
		loginList.put("User375", "pass1234");
		loginList.put("User533", "pass6789");
	}

	/**
	 * This Method is used to add UserName and Password
	 * 
	 * @param userName
	 * @param password
	 */
	public static void addUser(String userName, String password) {
		loginList.put(userName, password);
	}

	/**
	 * This Method is used to check whether the UserName is already Exists or Not
	 * 
	 * @param userName
	 * @return UserName Status
	 */
	public static boolean validUserName(String userName) {
		boolean validUserName = false;
		for (String key : loginList.keySet()) {
			if (key.equals(userName)) {
				System.out.println("Exists");
				validUserName = true;
				break;
			}
		}
		if (!validUserName) {
			System.out.println("Not Exists");
		}
		return validUserName;
	}

	/**
	 * This Method is used to check whether the Password length is Strong or Not
	 * 
	 * @param password
	 * @return Password Status
	 */
	public static boolean validPassword(String password) {
		boolean validPassword = false;
		if (password.trim().length() >= 8 && password != null) {
			validPassword = true;
			System.out.println("Strong Password");
		}
		else {
			System.out.println("Weak Password");
		}
		return validPassword;
	}
}
