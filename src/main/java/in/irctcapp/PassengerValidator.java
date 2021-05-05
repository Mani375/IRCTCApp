package in.irctcapp;

public class PassengerValidator {

	/**
	 * This Method is used to check the Age
	 * 
	 * @param age
	 * @return True or False
	 */
	public static boolean isValidAge(int age) {
		boolean valid = false;
		if (age > 0 && age < 100) {
			System.out.println("Valid Age");
			valid = true;
		} else {
			System.out.println("Invalid Age");
		}
		return valid;
	}
}
