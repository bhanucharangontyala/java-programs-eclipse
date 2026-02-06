package casestudy;

public class RideService {
	public static Ride bookRide(Customer customer, Driver driver, double distance, String rideType) {
		if (driver.isAvailable() && driver.getCity().equalsIgnoreCase(customer.getPickUpCity())) {
			driver.setAvailable(false);
			if (rideType.equalsIgnoreCase("Car")) {
				return new CarRide(customer, driver, distance, rideType);
			} else {
				return new BikeRide(customer, driver, distance, rideType);
			}
		} else {
			System.out.println("Driver is not Available or city mismatch");
			return null;
		}
	}
}
