package in.mani;

import java.util.HashMap;

public class TrainList {
	static HashMap<String, String> trainList = new HashMap<String, String>();
	static {
		trainList.put("02613", "TEJAS EXPRESS");
		trainList.put("02661", "POTHIGAI SUPERFAST EXPRESS");
	}
	static HashMap<String, String> classListPrice = new HashMap<String, String>();
	static {
		classListPrice.put("First Class(FC)", "Rs.760");
		classListPrice.put("Sleeper(SL)", "Rs.295");
		classListPrice.put("Second Sitting(2S)", "Rs.180");
	}

	public static void displayTrainList() {
		System.out.println("-------Train List--------");
		for (String key : trainList.keySet()) {
			System.out.println("Train No: " + key + "\n" + "Train Name: " + trainList.get(key) + "\n");
		}
		System.out.println("-------Class List--------");
		for (String key : classListPrice.keySet()) {
			System.out.println("Class: " + key + "\n" + "Fare: " + classListPrice.get(key) + "\n");
		}

	}
	
	public static void displaySearchedTrain(String trainNo)
	{
		for (String  train: TrainList.trainList.keySet()) {
			if(train.equals(trainNo)) {
				System.out.println(TrainList.trainList.get(train) + "(" + train + ")");
				System.out.println("\nFirst Class(FC) - Rs.760 \nSleeper(SL) - Rs.295 \nSecond Sitting(2S) - Rs.180");
				break;
		}
	}
	}

}
