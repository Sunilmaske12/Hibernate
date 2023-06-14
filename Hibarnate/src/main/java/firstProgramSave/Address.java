package firstProgramSave;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="Student_Address")
public class Address {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id @Column(name="address_id", length=4)
	private int id; 
	
	@Column(name="Street", length=10)
	private String street;
	
	@Column(length=15)
	private String city;
	
	@Column(length = 5)
	private boolean isOpen;
	
	@Transient //column not creted
	private double x;
	
	public Address( String street, String city, boolean isOpen, double x, Date createdDate, byte[] image) {
		super();
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.createdDate = createdDate;
		this.image = image;
	}

	@Column(length=15)
	@Temporal(TemporalType.DATE) //date formate
	private Date createdDate;
	
	@Column(name="Image")
	private  byte[] image;
	
	Address(){
		
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + ", x=" + x
				+ ", createdDate=" + createdDate + ", image=" + Arrays.toString(image) + "]";
	}
	
	
}
