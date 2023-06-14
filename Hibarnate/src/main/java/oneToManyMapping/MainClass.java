package oneToManyMapping;

import java.util.ArrayList;
import java.util.List;

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
		
		Answers ans3=new Answers(101, "Programing language", "objective");
		Answers ans1=new Answers(102, "Object Oriented Language", "objective");
		Answers ans2=new Answers(103, "Father of all programing language", "objective");
		
		List<Answers> ans=new ArrayList<Answers>();
		ans.add(ans1);
		ans.add(ans2);
		ans.add(ans3);
		

		Questions que=new Questions(201, "What is java", "Objective", ans);
	//	Questions que1=new Questions(202, "What is your name", "Objective", ans);
		
		session.save(que);
	//	session.save(ans);
		tx.commit();
		session.close();
	}
	
	
}