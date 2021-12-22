import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.Test;
import org.junit.jupiter.api.Tag;

public class OwnAnnotations {
	@Target({ ElementType.TYPE, ElementType.METHOD })
	@Retention(RetentionPolicy.RUNTIME)
	@Tag("fast")
	public @interface Fast {
	}
	public @interface FastTest {
	}
	
	@Fast
	@Test
	void myFastTest() {
	    // ...
	}
	@FastTest
	@Test
	void myFastTest1() {
	    // ...
	}
}



