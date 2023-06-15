package com.XMLMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/XMLMapping/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Person p=new Person( "Sunil", 23, "Khurshipar");
		session.save(p);
		tx.commit();
		System.out.println(session.get(Person.class, 1));
		session.close();
	}

}
