import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitMainTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Result result =JUnitCore.runClasses(JunitAnnotation.class);
      for(Failure fauiler:result.getFailures()) {
    	  System.out.println(fauiler.toString());
      }
      System.out.println(result.wasSuccessful());
	}

}
