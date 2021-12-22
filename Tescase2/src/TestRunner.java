
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Result result = JUnitCore.runClasses(TestJunit1.class);
//		Result result = JUnitCore.runClasses(TestJunit2.class);
//		Result result = JUnitCore.runClasses(TestJunit3.class);
		
		Result result = JUnitCore.runClasses(TestJunit.class);
		for (Failure fauiler : result.getFailures()) {
			System.out.println(fauiler.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}
