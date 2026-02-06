package com.strings;

public class StrMethods7 {
	int i = 12324;
	String s1 = "Java";

	@Override
	public String toString() {
		return "id : " + i + "Sub : " + s1;
	}

	public static void main(String[] args) {
		// 39. CharSequence subSequence(int startIndex, int endIndex)
		// it returns charSequence from start to end
		String s = "Bhanu Charan Gontyala";
		System.out.println(s.subSequence(6, 12));// Charan

		// 40. String subString(int startIndex)
		// it returns the String from the startIndex to end to the string
		System.out.println(s.substring(6));// Charan Gontyala

		// 41. String subString(int startIndex, int endIndex)
		// it returns the string from startIndex to endIndex
		System.out.println(s.substring(6, 12));// Charan

		// 42. char[] toCharArray()
		// it converts the string in to character array contains each letter as
		// Separate element
		char[] ch = s.toCharArray();
		for (char c : ch) {
			System.out.print(c + " ");
		}
		System.out.println();
		// 43. String toString()
		// converts into string
		// but when we override the toString method in our class, when we try
		// to print the class object instead of hashCode, the toString method will
		// be called the content content inside the method will execute.
		StrMethods7 str1 = new StrMethods7();
		System.out.println(str1);

		// 44. static String valueOf(boolean b)
		// 45. static String valueOf(char c)
		// 46. static String valueOf(char[] data)
		// 47. static String valueOf(char[] data, int offset, int count)
		// 48. static String valueOf(double d)
		// 49. static String valueOf(float f)
		// 50. static String valueOf(int i)
		// 51. static String valueOf(long l)
		// 52. static String valueOf(Object obj)

		// valueOf method will convert any type of data type to string
		long l = 123456789L;
		double d = 12345.34567;
		String s4 = String.valueOf(l);
		String s5 = String.valueOf(d);
		String s6 = String.valueOf(str1);
		System.out.println(s4 + "\n" + s5);
		System.out.println(s6);

		// if we want to convert String to different data type we use parse
		// method of wrapper data Types
		l = Long.parseLong(s4);
		d = Double.parseDouble(s5);
		System.out.println(l + (long) d);
	}

}
