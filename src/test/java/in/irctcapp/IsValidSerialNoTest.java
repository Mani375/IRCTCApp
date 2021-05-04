package in.irctcapp;

import static org.junit.Assert.*;

import org.junit.Test;

import in.irctcapp.Passenger;
import in.irctcapp.PassengerManager;

public class IsValidSerialNoTest {

	@Test
	//Tested with the Valid Serial Number
	public void testValidSerialNo() {
		Passenger passenger1 = new Passenger();
		passenger1.name = "Manikandan";
		passenger1.gender = "Male";
		passenger1.age = 21;
		passenger1.nationality = "Indian";
		passenger1.berthPreference = "Upper";
		
		Passenger passenger2 = new Passenger();
		passenger2.name = "Muthukumar";
		passenger2.gender = "Male";
		passenger2.age = 21;
		passenger2.nationality = "Indian";
		passenger2.berthPreference = "Middle";
		
		PassengerManager.addPassenger(1, passenger1);
		PassengerManager.addPassenger(2, passenger2);
		boolean actual = PassengerManager.removePassenger(1);
		assertTrue(actual);
	}
	
	@Test
	//Tested with the Invalid Serial Number
	public void testInvalidSerialNo() {
		Passenger passenger1 = new Passenger();
		passenger1.name = "Manikandan";
		passenger1.gender = "Male";
		passenger1.age = 21;
		passenger1.nationality = "Indian";
		passenger1.berthPreference = "Upper";
		
		Passenger passenger2 = new Passenger();
		passenger2.name = "Muthukumar";
		passenger2.gender = "Male";
		passenger2.age = 21;
		passenger2.nationality = "Indian";
		passenger2.berthPreference = "Middle";
		
		PassengerManager.addPassenger(1, passenger1);
		PassengerManager.addPassenger(2, passenger2);
		boolean actual = PassengerManager.removePassenger(3);
		assertFalse(actual);
	}

}
