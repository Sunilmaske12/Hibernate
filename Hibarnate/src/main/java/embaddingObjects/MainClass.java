package embaddingObjects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass{
	
	public static void main(String  arg[]) {
		Configuration cfg=new Configuration();
		cfg.configure("embaddingObject.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Address address1=new Address();
		address1.setAddressId(1);
		address1.setTowm("Khurshipar");
		address1.setStreet("Bhandara");
		address1.setState("Maharashtra");
				
		Student student1=new Student();
		student1.setId(1);
		student1.setName("Sunil");
		student1.setVillage("Khurshipar");
		student1.setAddressDetails(address1);
		
		
		Address address2=new Address();
		address2.setAddressId(2);
		address2.setTowm("Gunthara");
		address2.setStreet("Rajegaon");
		address2.setState("UP");
				
		Student student2=new Student();
		student2.setId(2);
		student2.setName("Anil");
		student2.setVillage("Gunthara");
		student2.setAddressDetails(address2);
		
		
		session.save(student1);
		session.save(student2);
		tx.commit();
		session.close();
	}
	
	
}