package in.mani;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidUserNameTest {

	@Test
	// In this Test Case UserName is already Exists.
	public void test1() {
		String userName = "Muthu533";
		String valid = Registration.validUserName(userName);
		assertEquals("Exists", valid);
	}

	@Test
	// In this Test Case UserName is not Exists.
	public void test2() {
		String userName = "Muthu532";
		String valid = Registration.validUserName(userName);
		assertEquals("Not Exists", valid);
	}
}
