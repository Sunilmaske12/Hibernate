package manyToManyMapping;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String arg[]) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		Project p1=new Project();
		Project p2=new Project();
		Project p3=new Project();
		
		e1.seteId(1);
		e2.seteId(2);
		e3.seteId(3);
		
		e1.seteName("Sunil");
		e2.seteName("Payal");
		e3.seteName("Pallavi");
		
		p1.setpId(201);
		p2.setpId(202);
		p3.setpId(203);
		
		p1.setpName("OES");
		p2.setpName("NoteTaker");
		p3.setpName("SMS");
		
		List<Project> projects=new ArrayList<Project>();
		List<Employee> employees=new ArrayList<Employee>();
		
		projects.add(p1);
		projects.add(p2);
		projects.add(p3);
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		e1.setProject(projects);
		p3.setEmp(employees);
		
		Transaction tx=session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(e1);
		session.save(e2);
		session.save(e3);
	
				tx.commit();
				session.close();
	}
}
