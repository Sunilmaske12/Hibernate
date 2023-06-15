package manyToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	int pId;
	String pName;
	@ManyToMany(mappedBy = "project")
	List<Employee> emp;
	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", emp=" + emp + "]";
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
