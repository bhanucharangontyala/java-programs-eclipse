package com.loops;

public class PerfectNum2 {

//	boolean perfect(int n) {
//		if(n<=0) {
//			return false;
//		}
//		int sum=0;
//		for(int i=1;i<=n/2;i++) {
//			if(n%i==0) {
//				sum+=i;
//			}
//		}
//		return sum==n;
//	}

	void main(String[] args) {
		int n = 1000;
//		for (int i = 1; i <= n; i++) {
//			if(perfect(i))
//			System.out.println(i);
//		}
//		
		for (int i = 1; i <= n; i++) {
			int sum = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (i == sum) {
				System.out.println(i);
			}
		}
	}

}
