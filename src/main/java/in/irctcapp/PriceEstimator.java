package in.irctcapp;

public class PriceEstimator {

	/**
	 * This Method is used to Calculate Fare to respective Train Class
	 * @param classType
	 * @return
	 * Fare Amount
	 */
	public static int fareCalculator(String classType) {
		boolean valid = false;
		int totalFare = 0;
		for (String trainClassType:  TrainList.classListPrice.keySet()) {
			if(trainClassType.equalsIgnoreCase(classType)) {
				int baseFare = TrainList.classListPrice.get(trainClassType);
				int gst = 10;
				totalFare = baseFare + gst;
				valid = true;
				System.out.println("Valid Train Class");
			}
		}
		if(!valid) {
			System.out.println("Invalid Train Class");
		}
		return totalFare;
	}
}
