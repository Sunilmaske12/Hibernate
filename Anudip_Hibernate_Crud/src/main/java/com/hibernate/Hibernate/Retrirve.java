package com.hibernate.Hibernate;

import org.hibernate.Session;

import com.hibernate.Entity.Employee;
import com.hibernateUtility.HibernateUtil;

public class Retrirve {

	public static void main(String[] args) {

        Session session=HibernateUtil.getSession();
	       try {
	    	   session.beginTransaction();
	    	   
	    	   //getting emp with id=1
	    	   Employee emp=session.get(Employee.class, 2); 
	    	   System.out.println("Employee with id 1 : "+emp);
	       
	       }
	        catch (Exception e) {
				e.printStackTrace();
			}
	        session.close();
	}
}
