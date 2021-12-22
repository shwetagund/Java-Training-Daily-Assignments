package onetomanydatabase;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2ManyRelation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// Session Factory is Thread Safe Object and can live in the memory for long
		// without any negative effect
		Session session = factory.openSession();
		// Session is not Thread Safe Object and can not live in the memory for long
		Transaction tx = session.beginTransaction();
		// Process to execute the Query
		Phone p1 = new Phone();
		p1.setPhoneNumber("34343455645");
		p1.setType("home");
		
		Phone p2 = new Phone();
		p2.setPhoneNumber("355645");
		p2.setType("office");
		
		List<Phone> phones = new ArrayList<Phone>();
		phones.add(p2);
		phones.add(p1);
		
		Email e1=new Email();
		e1.setEmail("shwetagund5566@gmail.com");
		e1.setEmail("abc@gmail.com");
		e1.setEmail("bc@gmail.com");
		e1.setEmail("abcd@gmail.com");
		
		List<Email> emails =new ArrayList<Email>();
		emails.add(e1);
		
		Employee1 employee = new Employee1();
		employee.setEmpAddress("New Delhi");
		employee.setEmpContact(34543434);
		employee.setEmpName("Dr. Tarkeshwar Barua");
		employee.setTelephones(phones);
		employee.setEmails(emails);
		
		;
		
		session.save(p1);
		session.save(p2);
		session.save(e1);
		session.save(employee);
		tx.commit(); // Saving Object Permanently ans closing session
		factory.close(); // closing very expensive connection
	}
}
