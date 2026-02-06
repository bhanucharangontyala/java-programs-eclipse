package casestudy;

public class BikeRide extends Ride {

	public BikeRide(Customer customer, Driver driver, double distance, String status) {
		super(customer, driver, distance, status);
	}

	@Override
	public double calculateFare() {
		return distance * 8;
	}

}
