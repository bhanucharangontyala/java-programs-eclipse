package student;

public class Student {
	
//	{
//	System.out.println("instance block");
//	}
	void hello() {

		System.out.println("instance method is being called");
	}

//	@Override
//    protected void finalize() throws Throwable {
//        System.out.println("Garbage collector is being called");
//    }

	
	public static void main(String args[]) {
		System.out.println("Main method ");
		
//	    student.Student@79fc0f2f
		Student std = new Student();
		//student.Student@50040f0c
		Student std1 = new Student();
//		student.Student@2dda6444		
		Student std2 = new Student();
		Student std3 = new Student();
//		Student std4 = new Student();
		
		
		std = null;//nullifying the reference
		std2 = std1;//allocating  one object to another
		std3.hello();//objects inside the normal method
		new Student();//objects with no reference
		
		
		
		System.gc();
		System.out.println(std);
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);
			
	}
	
//	static {
//		System.out.println("Static Block");
//	}
	
	
	
	
}
