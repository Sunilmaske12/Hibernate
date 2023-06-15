package com.criteriaAPI;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pegination.Customer;

public class Main {

	public static void main(String[] args) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		
		Criteria criteria= session.createCriteria(Customer.class);
	//data fetch without writting query
		List<Customer> list= criteria.list();
		for(Customer st:list) {
			System.out.println(st);
		}
		
		//we can add some restriction here as well
		criteria.add(Restrictions.eq("Customer_Name","Sunil" ));
		List<Customer> list1= criteria.list();
		System.out.println(list1);
		
		criteria.add(Restrictions.lt("Address_Id", 25)); //lt stands for less than where as gt : greater than
		List<Customer> list2= criteria.list();
		for(Customer c2:list2) {
			System.out.println("\n"+c2);
			
		}
		
		

		session.close();

	}

}
