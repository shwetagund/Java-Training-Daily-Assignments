import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
public static void main(String[] args) {
			// TODO Auto-generated method stub
		 // Employe e = new Employee(); Approach is not good at all. 
			ClassPathXmlApplicationContext applicationContext =
					new ClassPathXmlApplicationContext("Const.xml"); 
                  Laptop l=(Laptop) applicationContext.getBean("mylaptop");
			BankeEmploye e=(BankeEmploye)applicationContext.getBean("myBank");   //anything give name
			System.out.println(e); 
			System.out.println(l);
			} 
		}

