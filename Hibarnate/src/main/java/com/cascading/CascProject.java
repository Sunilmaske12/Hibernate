package com.cascading;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CascProject {
	@Id //primary key
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int pId;
	private String pName;
	public CascProject( String pName) {
		super();
		
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "CascProject [pId=" + pId + ", pName=" + pName + "]";
	}
	
	
}
