package in.irctcapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class isValidSerialNo {

	@Test
	//Tested with the Valid Serial Number
	public void testValidSerialNo() {
		PassengerDetails passenger1 = new PassengerDetails();
		passenger1.name = "Manikandan";
		passenger1.gender = "Male";
		passenger1.age = 21;
		passenger1.nationality = "Indian";
		passenger1.berthPreference = "Upper";
		
		PassengerDetails passenger2 = new PassengerDetails();
		passenger2.name = "Muthukumar";
		passenger2.gender = "Male";
		passenger2.age = 21;
		passenger2.nationality = "Indian";
		passenger2.berthPreference = "Middle";
		
		PassengerDetails.addPassenger(1, passenger1);
		PassengerDetails.addPassenger(2, passenger2);
		boolean actual = PassengerDetails.removePassenger(1);
		assertTrue(actual);
	}
	
	@Test
	//Tested with the Invalid Serial Number
	public void testInvalidSerialNo() {
		PassengerDetails passenger1 = new PassengerDetails();
		passenger1.name = "Manikandan";
		passenger1.gender = "Male";
		passenger1.age = 21;
		passenger1.nationality = "Indian";
		passenger1.berthPreference = "Upper";
		
		PassengerDetails passenger2 = new PassengerDetails();
		passenger2.name = "Muthukumar";
		passenger2.gender = "Male";
		passenger2.age = 21;
		passenger2.nationality = "Indian";
		passenger2.berthPreference = "Middle";
		
		PassengerDetails.addPassenger(1, passenger1);
		PassengerDetails.addPassenger(2, passenger2);
		boolean actual = PassengerDetails.removePassenger(3);
		assertFalse(actual);
	}

}
