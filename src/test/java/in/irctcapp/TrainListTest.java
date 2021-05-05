package in.irctcapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrainListTest {

	@Test // In this Test Case with Valid Train Number

	public void testWithValidTrainNo() {
		boolean actual = TrainList.displaySearchedTrain(12331L);
		assertTrue(actual);
	}

	@Test // In this Test Case with Invalid Train Number

	public void testWithInvalidTrainNO() {
		boolean actual = TrainList.displaySearchedTrain(12633L);
		assertFalse(actual);
	}

	@Test // In this Test Case with Negative Value

	public void testWithNegativeNumbers() {
		boolean actual = TrainList.displaySearchedTrain(-2345);
		assertFalse(actual);
	}

}
