package firstProgramSave;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) throws IOException {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating student
		Student student=new Student();
		student.setName("Sunil");
		student.setVillage("Khurshipar");
		System.out.println(student);
		
		Student student1=new Student();
		student1.setName("Ankush");
		student1.setVillage("Nashil");

		Student student2=new Student();
		student2.setName("Ravi");
		student2.setVillage("Bihar");
		
		Student student3=new Student();
		student3.setName("Sanjay");
		student3.setVillage("Nagpur");
		
	//creating address using constructor inserting data
		Date currentdate=new Date();
//		FileInputStream fis1=new FileInputStream("src/main/java/images/IMG-20221124-WA0007.jpg");
//		byte[] data3=new byte[fis1.available()];
//		fis1.read(); fis1.close();
		
		Address address1=new Address( "sunil","bhandara", true , 2.4 , currentdate , null);
		Address address2=new Address("anil","gondia", true , 3.2 , currentdate, null);
		Address address3=new Address("raj","amaravati", true , 65,currentdate, null);
		Address address4=new Address("vikas","lakhani", true , 12.12 ,currentdate, null);

		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		session.save(student1);
		session.save(student2);
		session.save(student3);
		
		session.save(address1);
		session.save(address2);
		session.save(address3);
		session.save(address4);
		tx.commit();
		session.close();
		
		
		
	}

}
