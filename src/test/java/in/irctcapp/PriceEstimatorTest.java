package in.irctcapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class PriceEstimatorTest {

	@Test
	//Tested with the Valid Train Class
	public void testValidClass() {
		int actual = PriceEstimator.fareCalculator("sleeper");
		assertEquals(305,actual);
	}
	
	@Test
	//Tested with the Invalid Train Class
	public void testInvalidClass() {
		int actual = PriceEstimator.fareCalculator("sleep");
		assertEquals(0,actual);
	}
	
	@Test
	//Tested with the White Space Input
	public void testWithWhiteSpace() {
		int actual = PriceEstimator.fareCalculator("       ");
		assertEquals(0,actual);
	}

}
