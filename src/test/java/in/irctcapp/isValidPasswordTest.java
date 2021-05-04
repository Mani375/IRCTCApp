package in.irctcapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class isValidPasswordTest {

	@Test
	// In this Test Case Password is Stronger.
	public void testWithStrongerPassword() {
		String password = "pass1234";
		boolean valid = Registration.validPassword(password);
		assertFalse(valid);
	}

	@Test
	// In this Test Case Password is Weaker.
	public void testWithWeakerPassword() {
		String password = "pass12";
		boolean valid = Registration.validPassword(password);
		assertTrue(valid);
	}
	
	@Test
	// In this Test Case Password is Weaker.
	public void testWithWhiteSpace() {
		String password = "             ";
		boolean valid = Registration.validPassword(password);
		assertFalse(valid);
	}

}
