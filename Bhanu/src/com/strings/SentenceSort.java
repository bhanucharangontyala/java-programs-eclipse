package com.strings;

public class SentenceSort {

	public static void main(String[] args) {
		String str = "am2 I1 to4 going3 town6 Home5";
		String[] res = str.split(" ");
//		for (int i = 0; i < res.length; i++) {
//			for (int j = 0; j < res.length; j++) {
//				int k1 = res[i].length() - 1;
//				int k2 = res[j].length() - 1;
//				if (res[i].charAt(k1) < res[j].charAt(k2)) {
//					String temp = res[i];
//					res[i] = res[j];
//					res[j] = temp;
//				}
//			}
//		}

		for (int i = 0; i < res.length; i++) {
			int n = res[i].length() - 1;
			res[res[i].charAt(n)] = res[i];
		}

//		for (String r : res) {
//			System.out.print(r.replaceAll("\\d", "") + " ");
//		}

		String ans = "";
		for (String r : res) {
			r = r.replaceAll("\\d", "");
			char[] arr = r.toCharArray();
			ans = ans.concat(String.copyValueOf(arr).replaceAll("\\d", "") + " ");
		}
		System.out.println(ans);
	}

}
