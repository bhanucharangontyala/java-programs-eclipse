package com.collections;

import java.util.ArrayList;
import java.util.List;

public class RepeatHalfOfSize {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(1);
		l1.add(1);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(5);
		l1.add(1);

		int hSize = l1.size() / 2;
		for (int i = 0; i < l1.size(); i++) {
			int c = 0;
			for (int j = 0; j < l1.size(); j++) {
				if (l1.get(i).equals(l1.get(j))) {
					c++;
				}
			}
			System.out.println(l1.get(i) + " " + c);
			if (c >= hSize) {
				System.out.println("the repeated value half of its size : " + l1.get(i));
				break;
			}
		}

	}

}
