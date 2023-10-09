package com.hibernate.Hibernate;

import org.hibernate.Session;

import com.hibernate.Entity.Employee;
import com.hibernateUtility.HibernateUtil;

public class Insert {

	public static void main(String[] args) {

	        Session session=HibernateUtil.getSession();
	       try {
	    	   session.beginTransaction();
	    	   Employee emp1=new Employee("Ram", "AWS Trainer", 10000.0);
	    	   Employee emp2=new Employee("Sham", "QA", 20000.0);
	    	   Employee emp3=new Employee("Vijay", "Web developer", 30000.0);
	    	   Employee emp4=new Employee("Ashok", "AWS Trainer", 40000.0);
	    	   Employee emp5=new Employee("Avinash", "QA", 50000.0);
	    	   session.save(emp1);
	    	   session.save(emp2);
	    	   session.save(emp3);
	    	   session.save(emp4);
	    	   session.save(emp5);
	       }
	        catch (Exception e) {
				e.printStackTrace();
			}
	        session.close();
	}

}
