package constructors;
//Task 28-10-25
public class ConVehicle {
	ConVehicle() {
		System.out.println("No-arg Constructor of Vehicle");
	}

	ConVehicle(String type) {
		System.out.println("The Type of Vehicle :" + type);
	}
	
	public static void main(String[] args) {
		ElectricCar c1 = new ElectricCar("Car","Suzuki",400000);
		System.out.println(c1.hashCode());
	}

}

class Car extends ConVehicle {

	Car() {
		System.out.println("No-arg Constructor of Car");
	}

	Car(String type, String brand) {
		System.out.println("The Type of Vehicle :" + type);
		System.out.println("The Brand of Car :" + brand);
//		super(type);
	}
}

class ElectricCar extends Car {
	ElectricCar() {
		System.out.println("No-arg Constructor of ElectricCar");
	}

	ElectricCar(String type, String brand,int batterycap) {
		System.out.println("The Type of Vehicle :" + type);
		System.out.println("The Brand of Car :" + brand);
		System.out.println("The Capacity of the Battery :"+batterycap);
//		super(type,brand);
	}
	
}
