package operators;

class A{
	
}
class B extends A{
	
}

public class Operators10 {
//	8.instanceof operator
//	  -it is used to check an object is the instanceof parent class or 
//	   another classes or interface
//	  - it only returns boolean values
//	  - instanceof
	
	
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		String s1 = new String("charan");
		System.out.println(obj1 instanceof A);//true
		System.out.println(obj1 instanceof B);//false
		System.out.println(obj1 instanceof Object);//true
		System.out.println(obj2 instanceof B);//true
		System.out.println(obj2 instanceof A);//true
		System.out.println(obj2 instanceof Object);//true
//		Incompatible conditional operand types A and String
//		System.out.println(obj1 instanceof String);
		System.out.println(s1 instanceof String);//true
		System.out.println(s1 instanceof Object);//true
		System.out.println(null instanceof Object);//false
//		Incompatible conditional operand types String and A
//		System.out.println(s1 instanceof A);
		
		
	}

}
