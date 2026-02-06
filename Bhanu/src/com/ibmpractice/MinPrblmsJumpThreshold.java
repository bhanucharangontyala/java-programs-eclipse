package com.ibmpractice;

import java.util.Arrays;
import java.util.List;

public class MinPrblmsJumpThreshold {
	// Minimum Problems to Solve (Jump + Threshold)**
	// Solve minimum problems starting at index 0, jumping +1 or +2,
	// until max − min ≥ threshold.
	public static int minProblemsSolved(List<Integer> points, int threshold) {
		int n = points.size();
		int minval = points.get(0);

		for (int i = 0; i < n; i++) {
			if (points.get(i) - minval >= threshold) {
				int minsteps = (i + 1) / 2;
				return minsteps + 1;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		List<Integer> points = Arrays.asList(1, 2, 3, 5, 8);
		int threshold = 4;
		int res = minProblemsSolved(points, threshold);
		System.out.println("Minimum Problems solved is :" + res);
	}

}
