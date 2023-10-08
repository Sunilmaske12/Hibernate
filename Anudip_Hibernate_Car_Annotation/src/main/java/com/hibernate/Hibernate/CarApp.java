package com.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class CarApp 
{
    public static void main( String[] args )
    {
    	//configuration with db
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        
        //creating object of entity
         Car c=new Car();
        c.setId(2);
        c.setName("Fararri");
        c.setCost(20000);
        
        //saving the object into db
         session.save(c);
         
        transaction.commit();
        session.close();
    }
}
