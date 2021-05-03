package in.mani;

import java.util.HashMap;

public class TrainList {
	static HashMap<String, String> trainList = new HashMap<String, String>();
	//Adding the Train Name and Train Number
	static {
		trainList.put("02613", "TEJAS EXPRESS");
		trainList.put("02661", "POTHIGAI SUPERFAST EXPRESS");
		trainList.put("02679", "COIMBATORE EXPRESS");
	}
	static HashMap<String, String> classListPrice = new HashMap<String, String>();
	//Adding the Class and Fare
	static {
		classListPrice.put("First Class(FC)", "Rs.760");
		classListPrice.put("Sleeper(SL)", "Rs.295");
		classListPrice.put("Second Sitting(2S)", "Rs.180");
	}
	
	/**
	 * This Method is used to Display the searched Train Details
	 * @param trainNo
	 * @return
	 * Searched Train Details
	 */
	public static boolean displaySearchedTrain(String trainNo)
	{
		boolean valid = false;
		for (String  train: TrainList.trainList.keySet()) {
			if(train.equals(trainNo)) {
				valid = true;
				System.out.println(TrainList.trainList.get(train) + "(" + train + ")");
				for (String classPrice : TrainList.classListPrice.keySet()) {
					System.out.println("\n" + classPrice + " - " + TrainList.classListPrice.get(classPrice));
				}
				break;
		}
	}
		if(!valid) {
			System.out.println("No Matching Train(s) Found");
		}
		return valid;
	}

}
