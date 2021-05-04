package in.irctcapp;

import java.util.HashMap;

public class PassengerDetails {
	public String name;
	public int age;
	public String gender;
	public String nationality;
	public String berthPreference;
	
	static HashMap<Integer, PassengerDetails> passengerList = new HashMap<Integer, PassengerDetails>();
	
	@Override
	public String toString() {
		return "PassengerDetails [name=" + name + ", age=" + age + ", gender=" + gender + ", nationality=" + nationality
				+ ", berthPreference=" + berthPreference + "]";
	}
	
	
	/**
	 * This Method is used to check the Age
	 * @param age
	 * @return
	 * True or False
	 */
	public static boolean isValidAge(int age) {
		boolean valid = false;
		if(age > 1 && age < 100 ) {
			System.out.println("Valid Age");
			valid = true;
		}
		else {
			System.out.println("Invalid Age");
		}
		return valid;
	}
	
	
	/**
	 * This Method is used to add the Passenger Details
	 * @param serialNo
	 * @param passenger
	 */
	public static void addPassenger(int serialNo, PassengerDetails passenger) {
		passengerList.put(serialNo, passenger);
		System.out.println("Passenger Details added Successfully");
	}
	
	/**
	 * This Method is used to remove the Passenger Details
	 * @param serialNo
	 * @return
	 * Removed status
	 */
	public static boolean removePassenger(int serialNo) {
		boolean valid = false;
		if(passengerList.containsKey(serialNo)) {
		passengerList.remove(serialNo);
		valid =true;
		System.out.println("Passenger Details removed Successfully");
		}
		else {
			System.out.println("Invalid Serial Number");
		}
		return valid;
	}
	
	/**
	 * This Method is used to Display All the Passenger Details
	 */
	public static void displayAllPassengerDetails() {
		System.out.println("*********Passenger List***********");
		int serial=1;
		for (int serialNo : passengerList.keySet()) {
			System.out.println("Passenger : " + serial+ "\n" + passengerList.get(serialNo));
			serial++;
		}
	}
}