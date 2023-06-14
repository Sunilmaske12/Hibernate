package dataFetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import firstProgramSave.Address;
import firstProgramSave.Student;



public class MainClass {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		 cfg.configure(); //bydefault take name as hibernate.cfg.xml=>standard name of file
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		//fetch data 
		Student student=(Student)session.load(Student.class, 2);
		System.out.println(student);
		
		
		Address address=(Address)session.get(Address.class, 8);
		System.out.println(address);
		
		session.close();

	}

}
