package springCorebasicImplemenation;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("myNewFile.xml");
		Rectangle recatangle=(Rectangle) applicationContext.getBean("myrectangle");
	    System.out.println(recatangle);
	
	    Circle circle=(Circle) applicationContext.getBean("circle1");
	    System.out.println(circle);
	
	}
	

}
