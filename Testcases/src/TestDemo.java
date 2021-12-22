import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestDemo {
	
	@Test
	public void testAdd() {
		
		Calculator c1 = new Calculator();
		int expectedresult = 8;
		assertEquals(expectedresult, c1.addtion(3, 5));
	}
	
}
