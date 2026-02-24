package com.testpractice;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Objects;

public class Test22_02_26 {

	public static void main(String[] args) {
		// 1.
//		List<String> l = Arrays.asList("java","spring","hibernate");
//		System.out.println(l);
//		l.add("Microservices");
//		System.out.println(l);//UnsupportedOperationException

		// 2.
//		String s =null;
//		System.out.println(s);null
//		s = s+"java";
//		System.out.println(s);//nulljava

		// 3.
//		List<Integer> l = new ArrayList<>();
//		l.add(1);
//		l.add(2);
//		l.add(1, 3);
//		System.out.println(l);//[1,3,2]

		// 4.
//		String s = "null";
//		System.out.println(Objects.equals(null, s));//false

		// 5.
//		List<Integer> l = new ArrayList<>();
//		System.out.println(l.get(0));//IndexOutOfBounds

		// 6.
//		String s = "";
//		for(int i=0;i<3;i++) {
//			i+=2;
//			s+=i;
//			s+=1;
//		}
//		System.out.println(s);//21

//		String str = "java hello java spring spring spring";
//		String[] res = str.split(" ");
//
//		for (int i = 0; i < res.length; i++) {
//
//		    if (res[i].equals("0"))
//		        continue;
//
//		    String currentWord = res[i];  // store original word
//		    int count = 0;
//
//		    for (int j = 0; j < res.length; j++) {
//		        if (currentWord.equals(res[j])) {
//		            count++;
//		            res[j] = "0";  // mark visited
//		        }
//		    }
//
//		    System.out.println(currentWord + " = " + count);
//		}
	}

}
