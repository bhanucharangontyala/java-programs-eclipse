package com.strings;

public class StringIntro {

	public static void main(String[] args) {
		// Ways to create Strings
		//1.using String literals
		String s = "Bhanu ";
		String s6 = "Gontyala";
		String s8 = "Charan";
		//2. using new keyword
		String s1 = new String();
		String s2 = new String("Gontyala");
		String s7 = new String("Gontyala");
		//3. using re-assignment
		String s4 = s;
		//4. using concatenation
		String s5 = "Bhanu "+"Charan";
		
//		s.concat("Charan");// we cannot change the string because String is immutable
		s = s.concat("Charan");//this is re-assigning possible 
		System.out.println(s);
		
		System.out.println(s == s4);//true
		System.out.println(s2 == s6);//false
		System.out.println(s6 == s7);//false
		System.out.println((s+s8) == s5);//false
		System.out.println(s1 ==s2);//false
		System.out.println("******************");
		System.out.println(s.equals(s4));//true
		System.out.println(s2.equals(s6));//true
		System.out.println(s6.equals(s7));//true
		System.out.println((s+s8).equals(s5));//true
		System.out.println(s1.equals(s2));//false
		
		
		
}

}
