package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;

public class CollectionDemo1 {
	public static void main(String[] args) {
		// by using this we achieve abstraction hiding the implementation
		Collection<Integer> l1 = new ArrayList<>();
		Collection<Integer> l2 = new ArrayList<>();
		// methods in Collection Interface
		// 1.boolean add(Element)
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		System.out.println(l1);
		// 2. boolean addAll(Collection<Element> c);
		l2.addAll(l1);
		l2.add(21);
		l2.add(22);
		l2.add(23);
		System.out.println(l2);

		// 3. void clear()
//		l1.clear();
//		System.out.println(l1);
//		System.out.println(l2);

		// 4. boolean contains(Object)
		System.out.println(l2.contains(1));
		System.out.println(l2.contains(9));

		// 5. boolean containsAll(Collection<Element> c)
		System.out.println(l2.containsAll(l1));
		System.out.println(l1.containsAll(l2));

		// 6. boolean equals(Object o)
		System.out.println(l1.equals(l1));
		System.out.println(l1.equals(l2));

		// 7. int hashcode()
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());

		// 8. boolean isEmpty()
		System.out.println(l1.isEmpty());
		System.out.println(l2.isEmpty());

		// 9. Iterator<E> iterator()
		Iterator<Integer> itr1 = l1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		Iterator<Integer> itr2 = l2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		// 10. boolean remove(Object o)
		l2.remove(22);
		System.out.println(l2);

		// 11. boolean removeAll(Collection<Element> c)
		l2.removeAll(l1);
		System.out.println(l2);

		// 12. boolean removeIf(Predicate<? super E> filter)
		// uses lamda expersions

		// 13. int size()
		System.out.println(l1.size());
		System.out.println(l2.size());

		// 14. Spliterator spliterator()
		Spliterator<Integer> sp = l1.spliterator();
		while (sp.tryAdvance((element) -> System.out.print(element + " ")))
			;
		System.out.println();
		// 15. Object[] toArray()
		Object[] arr = l1.toArray();
		for (Object o : arr) {
			System.out.print(o + " ");
		}
		System.out.println();
		// 16. <T> T[] toArray(T[] a)
		Integer[] sarr = l1.toArray(new Integer[0]);
		for (Integer i : sarr) {
			System.out.print(i + " ");
		}
	}
}
