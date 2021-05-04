package in.irctcapp;

import java.util.HashMap;

public class PassengerManager {	
	static HashMap<Integer, Passenger> passengerList = new HashMap<Integer, Passenger>();
	
	/**
	 * This Method is used to add the Passenger Details
	 * @param serialNo
	 * @param passenger
	 */
	public static void addPassenger(int serialNo, Passenger passenger) {
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