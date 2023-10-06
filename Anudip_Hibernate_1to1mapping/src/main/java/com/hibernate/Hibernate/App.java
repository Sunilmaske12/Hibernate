package com.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.hibernate.Entity.Address;
import com.hibernate.Entity.User;

public class App 
{
	 public static void main(String[] args) 
	    {
	    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			try 
			{
			  User user=new User();
			  user.setUserName("soma");
			  
			  Address address=new Address();
			  address.setStreet("Airoli");
			  
			  user.setAddress(address);
			  address.setUser(user);
			  
			  session.save(user);
			  session.getTransaction().commit();
			
			  User retrievedUser=session.get(User.class, user.getuId());
			  Address retrievedAddress=retrievedUser.getAddress();
			  
			  System.out.println("User: "+retrievedUser.getUserName());
			  System.out.println("Address: "+retrievedAddress.getStreet());
			}
			finally 
			{
				session.close();
	            sessionFactory.close();
			}
		}
}
