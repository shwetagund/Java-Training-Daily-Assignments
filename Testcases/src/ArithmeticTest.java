import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmeticTest {
	public ArithmeticTest() {
	}

	@Test
	public void testFindSquareroot() {
		Arithmetic instance = new Arithmetic();
		double expResult = 8;
		double result = instance.findSquareroot(64);
		assertEquals("findSquareroot", expResult, result,0.0);
	}

}
