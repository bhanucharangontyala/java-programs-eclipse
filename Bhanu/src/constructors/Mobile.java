package constructors;
//Task-1 29-10-25
public class Mobile {
	String brand;
	String color;
	int price;

	Mobile() {
		brand = "unknown";
		price = 0;
		color = "unknown";
	}

	Mobile(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}

	Mobile(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void show() {
		System.out.println("*******Mobile Details******");
		System.out.println("Brand of Mobile :"+brand);
		System.out.println("Color of Mobile :"+color);
		System.out.println("Price of Mobile :"+price);
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.show();
		Mobile m2 = new Mobile("oppo","MetalBlue");
		m2.show();
		Mobile m3 = new Mobile("Oneplus","Jet Black", 25000);
		m3.show();
	}

}
