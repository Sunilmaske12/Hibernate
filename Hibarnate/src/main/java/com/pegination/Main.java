package com.pegination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
	//pegination means fetching data betweeen range
	
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Query q = session.createQuery("from customer_address");
		q.setFirstResult(5); // stating point
		q.setMaxResults(5);//size, here  5 rows  will print from row 5 to 9
		List<Customer> list = q.list();
		for(Customer c:list) {
			System.out.println(c);
			
		}
		
		session.close();
	}

}
