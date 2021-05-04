package in.irctcapp;

public class PassengerDetailsTest {

	//Tested to check the Add , Remove and Display Features
	public static void main(String[] args) {
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
		PassengerManager.removePassenger(1);
		PassengerManager.displayAllPassengerDetails();
	}
}
