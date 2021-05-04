package in.irctcapp;

import static org.junit.Assert.*;

import org.junit.Test;

import in.irctcapp.PassengerValidator;

public class IsValidAgeTest {

	@Test
	//Tested with the Valid Age
	public void testValidAge() {
		boolean actual = PassengerValidator.isValidAge(21);
		assertTrue(actual);
	}
	
	@Test
	//Tested with the Negative Value
	public void testInvalidAge() {
		boolean actual = PassengerValidator.isValidAge(-12);
		assertFalse(actual);
	}
	
	@Test
	//Tested with the Number above 100
	public void testAgeAbove100() {
		boolean actual = PassengerValidator.isValidAge(120);
		assertFalse(actual);
	}

}
