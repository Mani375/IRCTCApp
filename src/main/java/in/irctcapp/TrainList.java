package in.irctcapp;

import java.util.HashMap;

public class TrainList {
	static HashMap<Long, String> trainList = new HashMap<Long, String>();
	//Default adding  the Train Name and Train Number
	static {
		trainList.put(12613L, "TEJAS EXPRESS");
		trainList.put(12661L, "POTHIGAI SUPERFAST EXPRESS");
		trainList.put(12331L, "COIMBATORE EXPRESS");
	}
	static HashMap<String, Integer> classListPrice = new HashMap<String, Integer>();
	//Default adding the Class and Fare
	static {
		classListPrice.put("First Class", 760);
		classListPrice.put("Sleeper", 295);
		classListPrice.put("Second Sitting", 180);
	}
	
	/**
	 * This Method is used to Display the searched Train Details
	 * @param trainNo
	 * @return
	 * Searched Train Details
	 */
	public static boolean displaySearchedTrain(long trainNo)
	{
		boolean valid = false;
		for (long  train: TrainList.trainList.keySet()) {
			if(train == trainNo){
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
