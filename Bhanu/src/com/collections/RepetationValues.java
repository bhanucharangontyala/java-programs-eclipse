package com.collections;

import java.util.ArrayList;
import java.util.List;

public class RepetationValues {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(1);
		l1.add(2);
		l1.add(5);
		List<Integer> res = new ArrayList<>();
		for (int l : l1) {
			if (!res.contains(l)) {
				res.add(l);
			} else {
				System.out.print(l + " ");
			}
		}
	}

}
