import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

public class StandardTest {
	@BeforeAll
	static void initAll() {
	}

	@BeforeEach
	void init() {
	}

	@Test
     public void succeedingTest() {
	}

	@Test
	public void failingTest() {
		fail("a failing test");
	}

	@Test
	@Disabled("for demonstration purposes")
	public void skippedTest() {
		// not executed
	}

	@Test
	public void abortedTest() {
		assumeTrue("abc".contains("S"));
		fail("test should have been aborted");
	}

	@AfterEach
	void tearDown() {
	}

	@AfterAll
	static void tearDownAll() {
	}
}
