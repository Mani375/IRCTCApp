package in.mani;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidPasswordTest {

	@Test
	// In this Test Case Password is Stronger.
	public void test1() {
		String password = "pass1234";
		String valid = Registration.validPassword(password);
		assertEquals("Strong Password", valid);
	}

	@Test
	// In this Test Case Password is Weaker.
	public void test2() {
		String password = "pass12";
		String valid = Registration.validPassword(password);
		assertEquals("Weak Password", valid);
	}

}
