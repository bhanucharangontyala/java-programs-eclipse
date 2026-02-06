package student;

public class TypesOfVariables {
	//variables are classified int three types and two division
	//Types 1.instance variables 2.static variables 3.local variable
	//Based on position two divisions  
	int a = 10;
	static int B = 20; 
	
	public static void main(String[] args) {
		TypesOfVariables obj = new TypesOfVariables();
		
		B=30;
		System.out.println(B);//first the local variable will take as reference
		System.out.println();
		
		//local variables can access through directly through name 
		int a1 =20;
		System.out.println(a1);
		
		
		
		//static variables can access through
		// 1.directly using variable name
		System.out.println(B);
		// 2.using class name before variable name
		System.out.println(TypesOfVariables.B);//preferable
		// 3.using object variable
//		System.out.println(obj.B);
		//The static field TypesOfVariables.B should be accessed in a static way
		
		//instance variables can access only through using object reference variable
		System.out.println(obj.a);
		
		
	}

}
