package casestudy;

public class Driver {
	protected String dName;
	protected String city;
	protected boolean available;

	public Driver(String dName, String city, boolean available) {
		super();
		this.dName = dName;
		this.city = city;
		this.available = available;
	}

	public String getdName() {
		return dName;
	}

	public String getCity() {
		return city;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
