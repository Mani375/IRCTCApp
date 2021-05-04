package in.irctcapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsValidUserNameTest {

	@Test
	// In this Test Case UserName is already Exists.
	public void testExistUserName() {
		String userName = "User533";
		boolean valid = Registration.validUserName(userName);
		assertTrue(valid);
	}

	@Test
	// In this Test Case UserName is not Exists.
	public void testNotExistUserName() {
		String userName = "User532";
		boolean valid = Registration.validUserName(userName);
		assertFalse
		(valid);
	}
}
