package casestudy;

public class RideSharingApp {

	public static void main(String[] args) {
		Driver d1 = new Driver("Ravi", "Hyderabad", true);
		Customer c1 = new Customer("Bhanu", "Hyderabad");

		Ride r1 = RideService.bookRide(c1, d1, 23, "Car");

		if (r1 != null) {
			r1.showDetails();
			r1.updateStatus("On Ride");
			System.out.println("Ride status updated : on ride");
			r1.updateStatus("Completed");
			System.out.println("Ride Completed");
		}
	}

}
