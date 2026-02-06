package com.strings;

public class StringBuffer1 {

	public static void main(String[] args) {
		// StringBuffer is mutable strings
		// we have to create the StringBuffer only using Object creation of
		// StringBuffer class
		StringBuffer sb1 = new StringBuffer();
		// it will create the empty string using StringBuffer Object
		// the length will be 0
		// the capacity will be 16
		System.out.println(sb1.length());// 0
		System.out.println(sb1.capacity());// 16
		// every time we append if length not sufficient the capacity will
		//be increase to ((length * 2 ) + 2) 
		sb1.append("java is simple when you practice ");
//		(16*2)+2 = 34
		sb1.append("by bhanu charan hii java is simple ");
//		(34*2)+2 = 70
		sb1.append("when you practice");
		// (70 * 2) +2 = 142
		// if we give more length that capacity then length becomes capacity
		System.out.println(sb1);
		System.out.println(sb1.length());// 85
		System.out.println(sb1.capacity());// 142

		StringBuffer sb2 = new StringBuffer("Bhanu Charan");
		System.out.println(sb2);
		System.out.println(sb2.length());// 12
		System.out.println(sb2.capacity());// 28
		sb2.append("by bhanu charan hii java is simple ");
		// (28*2)+2 = 58
		System.out.println(sb2);
		System.out.println(sb2.length());// 47
		System.out.println(sb2.capacity());// 58

	}

}
