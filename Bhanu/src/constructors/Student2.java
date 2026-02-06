package constructors;
//27-10-2025 task
public class Student2 {
	String name;
	int rollno;
	int marks;

	Student2(String name, int rollno, int marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	Student2(Student2 s1, int marks) {
		this.name = s1.name;
		this.rollno = s1.rollno;
		this.marks = marks;
	}

	void show() {
		System.out.println("Name is: " + name);
		System.out.println("RollNo is: " + rollno);
		System.out.println("Marks is: " + marks);
	}

	public static void main(String[] args) {
		Student2 s1 = new Student2("Bhanu", 42, 95);
		s1.show();
		Student2 s2 = new Student2(s1, 89);
		s2.show();
	}

}
