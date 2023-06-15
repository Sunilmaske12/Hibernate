package com.Hibernate.Hibarnate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Student_Details") 
public class Student {
	
	@Id //primary key
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="StudentId")
	private int id;
	
	@Column(name="StudentName")
	private String name;
	
	@Column(name="StudentVillage")
	private String village;
	
	private Address addressDetails;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	
	
	public Address getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(Address addressDetails) {
		this.addressDetails = addressDetails;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", village=" + village + ", addressDetails=" + addressDetails
				+ "]";
	}
	
	
}
