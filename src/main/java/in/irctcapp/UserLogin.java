package in.irctcapp;

public class UserLogin {

	/**
	 * This Method is used to Validate the User Credential
	 * 
	 * @param userName
	 * @param password
	 * @return Login Status
	 */
	public static String checkUserLogin(String userName, String password) {
		String validUserLogin = "Invalid Credential";
		for (String key : Registration.loginList.keySet()) {
			if (key.equals(userName) && Registration.loginList.get(key).equals(password)) {
				validUserLogin = "Valid Credential";
			} else if (!Registration.loginList.get(key).equals(password) && key.equals(userName)) {
				validUserLogin = "Invalid Password";
			} else if (!key.equals(userName) && Registration.loginList.get(key).equals(password)) {
				validUserLogin = "Invalid Username";
			}
		}
		return validUserLogin;
	}
}
