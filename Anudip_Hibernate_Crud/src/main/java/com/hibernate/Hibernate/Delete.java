package com.hibernate.Hibernate;

import org.hibernate.Session;

import com.hibernate.Entity.Employee;
import com.hibernateUtility.HibernateUtil;

public class Delete {

	public static void main(String[] args) {

        Session session=HibernateUtil.getSession();
	       try {
	    	   session.beginTransaction();
	    	   
	    	   //delete emp with id=5
	    	   Employee emp=session.get(Employee.class, 2); 
		    	session.delete(emp);
		    	session.getTransaction().commit();
	         
	       }
	        catch (Exception e) {
				e.printStackTrace();
			}
	        session.close();
	}
}
