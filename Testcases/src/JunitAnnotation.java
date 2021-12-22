import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class JunitAnnotation {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("In before class");
//	assertEquals(0,0);
//	Assert.assertEquals(0, 0);
//	assertNull(null,0);
//	assertNotNull(1,0);
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}

	@Before
	public void before() {
		System.out.println("in before");
	}

	@After
	public void after() {
		System.out.println("in after");
	}

	@Test
	public void testing() {
		System.out.println("in test");

	}

	@Ignore
	public void ignore() {
		System.out.println("in ignore test");
	}
}
