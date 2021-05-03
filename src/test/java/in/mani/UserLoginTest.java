package in.mani;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserLoginTest {

	@Test
	// In this Test Case both UserName and Password are Valid
	public void test1() {
		String userName = "User533";
		String password = "pass6789";
		String validUserLogin = UserLogin.checkUserLogin(userName, password);
		assertEquals("Valid Credential", validUserLogin);
	}

	@Test
	// In this Test Case Invalid UserName and Valid Password
	public void test2() {
		String userName = "User53";
		String password = "pass6789";
		String validUserLogin = UserLogin.checkUserLogin(userName, password);
		assertEquals("Invalid Username", validUserLogin);
	}

	@Test
	// In this Test Case Valid UserName and Invalid Password
	public void test3() {
		String userName = "User533";
		String password = "pass67";
		String validUserLogin = UserLogin.checkUserLogin(userName, password);
		assertEquals("Invalid Password", validUserLogin);
	}

	@Test
	// In this Test Case both UserName and Password are Invalid
	public void test4() {
		String userName = "User";
		String password = "pass";
		String validUserLogin = UserLogin.checkUserLogin(userName, password);
		assertEquals("Invalid Credential", validUserLogin);
	}
}
