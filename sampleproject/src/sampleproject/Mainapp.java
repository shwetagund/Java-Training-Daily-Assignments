package sampleproject;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 // Employe e = new Employee(); Approach is not good at all. 
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("NewFile.xml"); 
		Employe e=(Employe)applicationContext.getBean("emp123"); 
		System.out.println(e); 
		} 
	}


