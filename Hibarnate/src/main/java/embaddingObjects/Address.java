package embaddingObjects;

import javax.persistence.Embeddable;

@Embeddable
public class Address{
	private int addressId;
	private String towm;
	private String street;
	private String state;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getTowm() {
		return towm;
	}
	public void setTowm(String towm) {
		this.towm = towm;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	Address(){
			}
}