package com.hibernate.Hibernate;

import org.hibernate.Session;

import com.hibernate.Entity.Employee;
import com.hibernateUtility.HibernateUtil;

public class Update {

	public static void main(String[] args) {

        Session session=HibernateUtil.getSession();
	       try {
	    	   session.beginTransaction();
	    	   
	    	   //update emp with id=1
	    	   Employee emp=session.get(Employee.class, 3); 
		    	emp.setEmpNname("Aniket");
		    	session.save(emp);
		    	session.getTransaction().commit();
	       
	       }
	        catch (Exception e) {
				e.printStackTrace();
			}
	        session.close();
	}
}
