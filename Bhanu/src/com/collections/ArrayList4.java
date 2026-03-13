package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayList4 {

	public static void main(String[] args) {
		// searching for the elements
		List<Integer> l = new ArrayList<>();
		List<Integer> res = new ArrayList<>();
		l.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 3, 5, 6, 78, 9, 9, 8, 1, 7, 7, 8, 8, 9, 9, 10, 11, 2, 13, 14));
		System.out.println(l);
		System.out.println(l.contains(6));
		System.out.println(l.contains(2));
		System.out.println(l.indexOf(3));
		System.out.println(l.indexOf(6));
		int c = 0;
		int max = 0;
		int min = Integer.MAX_VALUE;

		for (Integer i : l) {
			if (i % 2 == 0) {
				c++;
			}
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}
		System.out.println("The Number of Even Numbers : " + c);
		System.out.println("The Max is : " + max);
		System.out.println("The Min is : " + min);

		for (Integer i : l) {
			if (!res.contains(i)) {
				res.add(i);
			}
		}
		System.out.println(res);

		ListIterator<Integer> litr = l.listIterator();
		while (litr.hasNext()) {
			litr.next();
		}
		System.out.print("[");
		while (litr.hasPrevious()) {
			System.out.print(litr.previous() + ", ");
		}
		System.out.print("]");
	}

}
