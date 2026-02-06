package operators;

public class Operators4 {
	// == operator checks the address of the object
	// .equals method checks the content of string 
	public static void main(String[] args) {
		String s1 = "bhanu";
		String s2 = "bhanu";
		//they both are at same address in SCP
		System.out.println(s1 == s2);//true 
		System.out.println(s1.equals(s2));//check content of both strings
		
		String s3 = new String("charan");//2 objs
		String s4 = new String ("Charan");//1 obj 
		//they both have diff address in heap memory
		System.out.println(s3 == s4);//both are diff objs
		System.out.println(s3.equalsIgnoreCase(s4));//check content of both strings 
		//and it ignore the case sensitivity
	}

}
