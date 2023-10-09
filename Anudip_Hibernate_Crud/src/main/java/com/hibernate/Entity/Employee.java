package com.hibernate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="emptbl")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="eid")
	private Integer eId;
	@Column(name="empname")
	private String empNname;
	@Column(name="empdep")
	private String empDep;
	@Column(name="empsal")
	private Double empSal;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Integer geteId() {
		return eId;
	}



	public void seteId(Integer eId) {
		this.eId = eId;
	}



	public String getEmpNname() {
		return empNname;
	}



	public void setEmpNname(String empNname) {
		this.empNname = empNname;
	}



	public String getEmpDep() {
		return empDep;
	}



	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}



	public Double getEmpSal() {
		return empSal;
	}



	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}



	public Employee(String empNname, String empDep, Double empSal) {
		super();
		this.empNname = empNname;
		this.empDep = empDep;
		this.empSal = empSal;
	}
	
	

	public Employee(Integer eId, String empNname, String empDep, Double empSal) {
		super();
		this.eId = eId;
		this.empNname = empNname;
		this.empDep = empDep;
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", empNname=" + empNname + ", empDep=" + empDep + ", empSal=" + empSal + "]";
	}
	
	
	
	

}
