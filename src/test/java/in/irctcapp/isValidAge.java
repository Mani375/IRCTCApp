package in.irctcapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class isValidAge {

	@Test
	//Tested with the Valid Age
	public void testValidAge() {
		boolean actual = PassengerDetails.isValidAge(21);
		assertTrue(actual);
	}
	
	@Test
	//Tested with the Negative Value
	public void testInvalidAge() {
		boolean actual = PassengerDetails.isValidAge(-12);
		assertFalse(actual);
	}
	
	@Test
	//Tested with the Number above 100
	public void testAgeAbove100() {
		boolean actual = PassengerDetails.isValidAge(120);
		assertFalse(actual);
	}

}
