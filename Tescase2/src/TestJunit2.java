import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestJunit2 extends TestCase {
	protected double fvalue1;
	protected double fvalue2;

	@Before
	public void setUp() {
		fvalue1 = 2.0;
		fvalue2 = 3.0;
	}

	@Test
	public void testAdd() {
		System.out.println("no of test cases=" + this.countTestCases());

		String name = this.getName();
		System.out.println("no of test cases name=" + name);

		// test setName
		this.setName("testNewAdd");

		String newName = this.getName();
		System.out.println("Updated Test Case Name = " + newName);
	}

	// tearDown used to close the connection or clean up activities
	public void tearDown() {
	}
}
