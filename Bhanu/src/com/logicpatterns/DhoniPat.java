package com.logicpatterns;

public class DhoniPat {

	public static void main(String[] args) {
//		char[] arr = { 'D', 'H', 'O', 'N', 'I' };
//		char alp = 'a';
//		int sum = arr.length - 1;
//		int add = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				add = i + j;
//				if (i == j || add == sum) {
//					System.out.print(arr[i] + " ");
//				} else {
//					System.out.print(alp + " ");
//					alp++;
//				}
//			}
//			System.out.println();
//		}

//		String str = "DHONI";
//        char alp = 'a';
//        int sum = str.length() - 1;
//
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < str.length(); j++) {
//                int add = i + j;
//                if (i == j || add == sum) {
//                    System.out.print(str.charAt(i) + " ");
//                } else {
//                    
//                    System.out.print(alp + " ");
//                    alp++;
//                    if (alp > 'z') alp = 'a';
//                }
//            }
//            System.out.println();
//        }
		
		String str = "DHONI";
        int size = str.length();
        int sum = size - 1;

        // Create a filtered list of lowercase letters excluding those in str
        StringBuilder filtered = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(Character.toUpperCase(ch)) == -1 && str.indexOf(ch) == -1) {
                filtered.append(ch);
            }
        }

        int index = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == sum) {
                    System.out.print(str.charAt(i) + " ");
                } else {
                    System.out.print(filtered.charAt(index % filtered.length()) + " ");
                    index++;
                }
            }
            System.out.println();
        }



	}

}
