package student;
class Student2 {
	int id = 78;
	String name = "Bhanu Charan";
	int age = 22;
	long phone = 8341676632L;
	Address address = new Address();
}

class Address {
	String flat = "1-4/A";
	String plot = "NityaShree Nilayam";
	String street = " Allwyn Colony";
	String city = "Hyderabad";
	String state = "Telangana";
	long pincode = 500072;
}


public class TestDemo1 {
	
	Student2 s1 = new Student2();

	public static void main(String[] args) {
		TestDemo1 obj = new TestDemo1();
		System.out.println("ID :"+obj.s1.id);
		System.out.println("Name :"+obj.s1.name);
		System.out.println("Age :"+obj.s1.age);
		System.out.println("Phone :"+obj.s1.phone);
		System.out.println("Flatno:"+obj.s1.address.flat);
		System.out.println("plot :"+obj.s1.address.plot);
		System.out.println("Street :"+obj.s1.address.street);
		System.out.println("City :"+obj.s1.address.city);
		System.out.println("State :"+obj.s1.address.state);
		System.out.println("Pincode :"+obj.s1.address.pincode);
	}

}
