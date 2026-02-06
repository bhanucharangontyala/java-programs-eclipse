package casestudy;

public class CarRide extends Ride {

	public CarRide(Customer customer, Driver driver, double distance, String status) {
		super(customer, driver, distance, status);
	}

	@Override
	public double calculateFare() {
		return distance * 15;
	}
}
