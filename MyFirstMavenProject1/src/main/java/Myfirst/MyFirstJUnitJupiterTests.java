package Myfirst;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyFirstJUnitJupiterTests {
	private final Calculator calculator = new Calculator();

	@Test
	   public void addition() {
	        assertEquals(2, calculator.add(1, 1));
}
}