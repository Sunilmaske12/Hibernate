package com.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.Entity.Department;
import com.hibernate.Entity.Employee;

public class App 
{
	 public static void main(String[] args) 
	    {
	    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			try 
			{
			  Department dep=new Department();
			  dep.setName("IT");
			  
			  Employee emp1=new Employee();
			  emp1.setName("Ravi");
			  emp1.setDepartment(dep);
			  
			  Employee emp2=new Employee();
			  emp2.setName("Avinash");
			  emp2.setDepartment(dep);

			  dep.getEmployee().add(emp1);
			  dep.getEmployee().add(emp2);

			  session.save(dep);
			  session.getTransaction().commit();
			
			}
			finally 
			{
				session.close();
	            sessionFactory.close();
			}
		}
}
