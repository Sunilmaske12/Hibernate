package com.hibernate.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int uId;
	@Column
	private String userName;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Address address;

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User(int uId, String userName, Address address) {
		super();
		this.uId = uId;
		this.userName = userName;
		this.address = address;
	}

	public User() {
		super();
	}
	
	
	
	
}
