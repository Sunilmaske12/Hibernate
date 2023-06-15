package com.cascading;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	//in any relationship like oneToMany, whenever all data save or fetch or make any operataion , we need to perform action on all
	// but using cascading related data automatically execute
	public static void main(String[] args) {
		
		 Configuration cfg=new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	       Session s =  factory.openSession();
	       CascProject p1 = new CascProject("JavaProject");
	       CascProject p2 = new CascProject("J2EEProject");
	       CascProject p3 = new CascProject("PythonProject");
	       CascProject p4 = new CascProject("SpringProject");
	       
	       List<CascProject> projects = new ArrayList<CascProject>();
	       projects.add(p1);
	       projects.add(p2);
	       projects.add(p3);
	       projects.add(p4);
	       
	       CascStudent student = new CascStudent("Sunil",  projects);
	       Transaction tx = s.beginTransaction();
	       s.save(student);
	       
	       tx.commit();
	       factory.close();
	        s.close();
	}

}
