package in.irctcapp;

import static org.junit.Assert.*;

import org.junit.Test;

import in.irctcapp.TrainList;

public class TrainListTest {

	@Test // In this Test Case with Valid Train Number

	public void test1() {
		boolean actual = TrainList.displaySearchedTrain(12331L);
		assertTrue(actual);
	}

	@Test // In this Test Case with Invalid Train Number
	
	public void test2() {
		boolean actual = TrainList.displaySearchedTrain(12633L);
		assertFalse(actual);
	}
	
	@Test // In this Test Case with Negative Value
	
	public void test3() {
		boolean actual = TrainList.displaySearchedTrain(-2345);
		assertFalse(actual);
	}

}
