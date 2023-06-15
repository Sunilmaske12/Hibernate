package com.pegination;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="customer_address")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Address_Id;
	private int id;
	private String Customer_Name;
	private String Email;
	private String Address;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [Address_Id=" + Address_Id + ", id=" + id + ", Customer_Name=" + Customer_Name + ", Email="
				+ Email + ", Address=" + Address + "]";
	}

	
	
	
}
