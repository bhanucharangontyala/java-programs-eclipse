package operators;

public class Operators8 {
//	6.Bitwise Operators
//	  - performs operation on individual bits of an integer
//	  - used in lower level programming , encryption, decryption, optimizing the code
//	  - these will work on boolean and integers
//	  - (&) - bitwise AND
//	  - (|) - bitwise OR
//	  - (^) - bitwise XOR
//	  - (~) - bitwise complement
//	  - (<<) - left shift
//	  - (>>) - right shift
//	  - (>>>) - unsigned right shift
//	  - for boolean values bitwise operators works faster
	
	  public static void main(String[] args) {
		  int a = 24;
		  System.out.println("*****bitwise AND*****");
		  System.out.println(true & true);//true
		  System.out.println(true & false);//false
		  System.out.println(false & true);//false
		  System.out.println(false & false);//false
		  System.out.println(67 & 23);//3
		  System.out.println(89 & 45);//9
		  System.out.println("*****bitwise OR*****");
		  System.out.println(true | true);//true
		  System.out.println(true | false);//true
		  System.out.println(false | true);//true
		  System.out.println(false | false);//true
		  System.out.println(67 | 23);//87
		  System.out.println(89 | 45);//125
		  System.out.println("*****bitwise XOR*****");
		  System.out.println(true ^ true);//false
		  System.out.println(true ^ false);//true
		  System.out.println(false ^ true);//true
		  System.out.println(false ^ false);//false
		  System.out.println(67 ^ 23);//84
		  System.out.println(89 ^ 45);//116
		  System.out.println("*****bitwise complement******");
		  System.out.println(~a);//-(n+1)
		  System.out.println("******left shift ********");
		  System.out.println(25 << 4);//400
		  System.out.println(67 << 3);//536
		  System.out.println("*****right shift******");
		  System.out.println(25 >> 2);//6
		  System.out.println(346 >> 3);//43
		  System.out.println("******unsigned right shift******");
		  System.out.println(25 >>> 5);//0
		  System.out.println(346 >>> 3);//43
	  }
	 
}
