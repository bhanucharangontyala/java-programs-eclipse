package casestudy;

public class Customer {
	protected String cName;
	protected String pickUpCity;
	
	public Customer(String cName, String pickUpCity) {
		this.cName = cName;
		this.pickUpCity = pickUpCity;
	}
	public String getcName() {
		return cName;
	}
	public String getPickUpCity() {
		return pickUpCity;
	}
}
