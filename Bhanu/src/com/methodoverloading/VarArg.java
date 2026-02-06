package com.methodoverloading;

public class VarArg {

	static int add(String b, int... a) {
		int sum = 0;
		for (int a1 : a) {
			sum += a1;
		}
		System.out.println(b);
		return sum;
	}
	//we can use any data type as var-arg but all the arguments must be the same data 
	//type and var-arg must be the last parameter of that method.
	public static void main(String[] args) {
		System.out.println(add("Charan", 20, 30, 40));
		System.out.println(add("Charan",10,34,45,65,76,7));
	}

}
