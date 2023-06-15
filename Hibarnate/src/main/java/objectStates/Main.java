package objectStates;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hibernate.Hibarnate.Student;


public class Main {

	public static void main(String[] args) {
		// there are 4 states 
		//1. Transient
		//2.Persistent
		//3. Detached
		//4.Remove
		
		
		System.out.println("HELLO");
		
		Configuration cfg=new Configuration();
		cfg.configure("com/Hibernate/Hibarnate/hibernate.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student student=new Student();
		student.setId(9);
		student.setName("Ajay");
		student.setVillage("Bhandara");
		//till this transient state: because object are created but not in session as well as database
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		//2:persistent state, here object associated with session as well as database
		//we can override any value
		student.setName("Ram");//this will store in db instead of "ajay"
		
		
		session.delete(student);
		//remove state: object delete from db
		
		tx.commit();
			
		session.close();
		//Detach state, here object are not associated with session, only associate in db, session close
		factory.close();
		
	}

}
