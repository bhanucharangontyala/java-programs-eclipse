package com.arrays;

public class DfDataArray {
	// creating arrays using different data types
	// byte, short, int, long, double, float, char, string
	public static void main(String[] args) {
		// 1.strings
		String[] names = new String[4];
		names[0] = "Bhanu";
		names[1] = "Charan";
		names[2] = "Gowtam";
		names[3] = "Prabhakar";
		System.out.println(names);//address of the object
		// if we try to initialize more than size of the array we
		// get arrayOutOfBounds Exception
//		for (int i = 0; i < names.length; i++) {
//			System.out.print(names[i] + " ");
//		}
		// or
		for (String s : names) {
			System.out.print(s + " ");
		}

		System.out.println();
		// float / double
		float[] f = new float[3];

		f[0] = 1.3f;
		f[1] = 4f;
		f[2] = 1.5f;

		for (float f1 : f) {
			System.out.print(f1 + " ");
		}
		System.out.println();
		// char
		char[] ch = new char[5];
		ch[0] = 'M';
		ch[1] = 'T';
		ch[2] = 'F';
		for (char c : ch) {
			System.out.print(c + " ");
		}
		System.out.println();
		// long
		long[] l = new long[4];
		l[0] = 14567890;
		l[1] = 2234567890L;
		l[2] = 34567;
		l[3] = 42313;
		for (long l1 : l) {
			System.out.print(l1 + " ");
		}

	}

}
