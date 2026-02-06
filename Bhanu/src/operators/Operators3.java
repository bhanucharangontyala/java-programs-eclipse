package operators;

public class Operators3 {
	/*
	 3.relational/comparision operators 
	   - used to compare two operands and determine the relationship between them
	   - these operators always return boolean values as the result
	   - they are fundamental for controlling program flow in conditional statements
	     and loops
	   - (==) - equals to
	     (<) - less than 
	     (<=) - less than or equals to
	     (>) - greater than
	     (>=) - grater than or equals to
	     (!=) - not equals to 
	 */

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a==b & a<b | a<b);//false
		System.out.println(a<b);//true
		System.out.println(a<=b);//true
		System.out.println(a>b);//false
		System.out.println(a>=b);//false
		System.out.println(a!=b);//true
		System.out.println("******************");
		
		//the string with string literal will store in SCP wher when we create
        //another string with same value it doesnot create new object it points to 
        //old value
		String s1 = "bhanu";
		String s2 = "bhanu";
		System.out.println(s1 == s2);
		//but when we create string using new keyword it creates 2 objects one 
//		  in heap memory and also stores the value in SCP with no reference 
//		  when we create another string with same value it one creates new object in
//		  heap Memory not in SCP
		String s3 = new String("charan");//2 objs
		String s4 = new String ("charan");//1 obj 
		System.out.println(s3 == s4);//both are diff objs
		
		
		
	}

}
