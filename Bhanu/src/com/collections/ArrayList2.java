package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ArrayList2 {

	public static void main(String[] args) {
		// Ways of iterator the list
		List<Integer> l = new ArrayList<>();
		l.add(31);
		l.add(12);
		l.add(31);
		l.add(42);
		l.add(5);

		// iterating the ArrayList by using for loop
		System.out.println("for loop");
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
		System.out.println();
		// iterating using for each loop
		System.out.println("for each loop");
		for (Integer i : l) {
			System.out.print(i + " ");
		}
		System.out.println();
		// iterating using iterator()
		System.out.println("using iterator");
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		// iterator using ListIterator
		System.out.println();
		System.out.println("using ListIterator");
		ListIterator<Integer> litr = l.listIterator();
		while (litr.hasNext()) {
			System.out.print(litr.next() + " ");
		} // here the cursor will be at end of the list after iterator
			// so list iterator can iterate both ways
			// iterator using ListIterator
		System.out.println();
		System.out.println("reverse order");
		while (litr.hasPrevious()) {
			System.out.print(litr.previous() + " ");
		}
		// iterating using spliterator
		System.out.println();
		System.out.println("using spliterator");
		Spliterator<Integer> spi = l.spliterator();
		while (spi.tryAdvance((element) -> System.out.print(element + " ")))
			;
	}

}
