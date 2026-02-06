//package com.arrays;
//
//public class NegPosArr {
//
//	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5, -1, -2, -3, -4, -5 };
//		int[] res = new int[arr.length];
//
//		for (int i = 0; i < res.length; i++) {
//			while (arr[i] > 0) {
//				res[i] = arr[i];
//				break;
//			}
//			while (arr[i] < 0) {
//				res[i] = arr[i];
//				break;
//			}
//		}
//		for (int n : res) {
//			System.out.print(n + " ");
//		}
//	}
//
//}
package com.arrays;

public class NegPosArr {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, -1, -2, -3, -4, -5};

        int posCount = 0, negCount = 0;

        // Count positives and negatives
        for (int x : arr) {
            if (x >= 0)
                posCount++;
            else
                negCount++;
        }

        // Create arrays
        int[] pos = new int[posCount];
        int[] neg = new int[negCount];

        int p = 0, n = 0;

        // Fill arrays
        for (int x : arr) {
            if (x >= 0)
                pos[p++] = x;
            else
                neg[n++] = x;
        }

        // Result array
        int[] res = new int[arr.length];

        int i = 0, j = 0, k = 0;

        // Alternate merge
        while (i < pos.length && j < neg.length) {
            res[k++] = pos[i++];
            res[k++] = neg[j++];
        }

        // Remaining positives
        while (i < pos.length) {
            res[k++] = pos[i++];
        }

        // Remaining negatives
        while (j < neg.length) {
            res[k++] = neg[j++];
        }

        // Print result
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
