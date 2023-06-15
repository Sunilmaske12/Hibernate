package com.cascading;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CascStudent {

	@Id //primary key
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;	
	private String name;
	@OneToMany(mappedBy = "pName", cascade = CascadeType.ALL)
	private List<CascProject> cascProject;
	
	public CascStudent( String name, List<CascProject> cascProject) {
		super();
		this.name = name;
		this.cascProject = cascProject;
	}
	
	CascStudent(){
		
	}

	@Override
	public String toString() {
		return "CascStudent [id=" + id + ", name=" + name + ", cascProject=" + cascProject + "]";
	}
	
	
	
}
