package oneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass{
	
	public static void main(String  arg[]) {
		Configuration cfg=new Configuration();
		cfg.configure("oneToOneMapping.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Answers ans=new Answers(101, "Red, blue ..", "objective");
		Questions que=new Questions(201, "What are colors", "Objective", ans);
		
		Answers ans1=new Answers(102, "My name is sunil", "objective");
		Questions que1=new Questions(202, "What is your name", "Objective", ans);
		
		session.save(que);
		session.save(ans);
		session.save(que1);
		session.save(ans1);
		tx.commit();
		session.close();
	}
	
	
}