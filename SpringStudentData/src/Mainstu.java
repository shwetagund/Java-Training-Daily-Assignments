import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mainstu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("student.xml"); 
		Student s=(Student)applicationContext.getBean("student1");
//		 Book b=(Book)applicationContext.getBean("mybook"); 
		System.out.println(s); 
//		System.out.println(b);
	}

}
