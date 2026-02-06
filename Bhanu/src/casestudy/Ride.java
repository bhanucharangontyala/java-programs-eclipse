package casestudy;

public abstract class Ride {
	protected Customer customer;
	protected Driver driver;
	protected double distance;
	protected String status;

	public Ride(Customer customer, Driver driver, double distance, String status) {
		this.customer = customer;
		this.driver = driver;
		this.distance = distance;
		this.status = "Booked";
	}

	public abstract double calculateFare();

	public void updateStatus(String status) {
		this.status = status;
	}

	public void showDetails() {
		System.out.println("Customer Name : " + customer.getcName());
		System.out.println("Driver Name : " + driver.getdName());
		System.out.println("Distance : " + distance + " km");
		System.out.println("Status : " + status);
		System.out.println("Fare : " + calculateFare());
	}

}
