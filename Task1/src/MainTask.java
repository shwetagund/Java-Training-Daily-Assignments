import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("NewTask.xml"); 
		Product p=(Product)applicationContext.getBean("product1");
		Order order=(Order)applicationContext.getBean("order1"); 
		System.out.println(order); 
		System.out.println(p);
       
	}

}
