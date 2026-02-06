package student;

public class Vehicle {
	
	static void hello() {
		System.out.println("Hello");
	}
	
	static void hii() {
		System.out.println("Hii..");
	}
	
	void song(){
		System.out.println("Song is playing");
	}
	
	void dog(){
		System.out.println("Dog is Barking..");
	}
	
	static {
		Vehicle v = new Vehicle();
		v.song();
		v.dog();
	}
	
	
	public static void main(String[] args) {
	hello();
	hii();
	}
}
