package in.mani;

import java.util.HashMap;

public class Registration {
	static HashMap<String, String> loginList = new HashMap<String, String>();
	static {
		loginList.put("Mani375", "pass1234");
		loginList.put("Muthu533", "pass6789");
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
	public static String validUserName(String userName) {
		String validUserName = "Not Exists";
		for (String key : loginList.keySet()) {
			if (key.equals(userName)) {
				validUserName = "Exists";
				break;
			}
		}
		return validUserName;
	}

	/**
	 * This Method is used to check whether the Password length is Strong or Not
	 * 
	 * @param password
	 * @return Password Status
	 */
	public static String validPassword(String password) {
		String validPassword = "Weak Password";
		if (password.length() >= 8) {
			validPassword = "Strong Password";
		}
		return validPassword;
	}

	/*
	 * public static void displayUser() { for ( String key :
	 * userNamePassword.keySet()) { System.out.println("UserName: " + key +"\n" +
	 * "Password: " + userNamePassword.get(key) + "\n"); } }
	 * 
	 */
}
