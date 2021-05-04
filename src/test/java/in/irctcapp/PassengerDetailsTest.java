package in.irctcapp;

public class PassengerDetailsTest {

	//Tested to check the Add , Remove and Display Features
	public static void main(String[] args) {
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
		PassengerDetails.removePassenger(1);
		PassengerDetails.displayAllPassengerDetails();
	}
}
