package in.mani;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrainListTest {

	@Test // In this Test Case with Valid Train Number

	public void test1() {
		boolean actual = TrainList.displaySearchedTrain("02679");
		assertEquals(true, actual);
	}

	@Test // In this Test Case with Invalid Train Number
	
	public void test2() {
		boolean actual = TrainList.displaySearchedTrain("02633");
		assertEquals(false, actual);
	}

}
