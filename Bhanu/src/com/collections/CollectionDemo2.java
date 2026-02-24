package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class CollectionDemo2 {

	public static void main(String[] args) {
		// Methods in the List Interface
		List<Integer> l = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();

		// 1. boolean add(Element)
		l.add(1);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(8);
		l.add(9);

		// 2. boolean addAll(Collection<Element> c)
		l2.addAll(l);

		// 3. boolean add(index, Element)
		l.add(3, 5);

		// 4. boolean addAll(index,Collection<E> c)
		l2.addAll(3, l2);

		// 5. void clear()
//		l.clear();

		// 6. boolean contains(Object o)
		System.out.println(l.contains(1));
		System.out.println(l.contains(2));

		// 7. boolean containsAll(Collection<E> c)
		System.out.println(l2.containsAll(l));
		System.out.println(l.containsAll(l2));

		// 8. boolean equals(Object o)
		System.out.println(l.equals(l));
		System.out.println(l.equals(l2));

		// 9. E get(int index)
		System.out.println(l.get(4));
		System.out.println(l.get(2));// IndexOutOfBoundsException

		// 10. int hashcode()
		System.out.println(l.hashCode());
		System.out.println(l2.hashCode());

		// 11. int indexOf(Object o)
		System.out.println(l.indexOf(1));
		System.out.println(l2.indexOf(1));
		System.out.println(l2.indexOf(2));// -1

		// 12. boolean isEmpty();
		System.out.println(l.isEmpty());
		System.out.println(l2.isEmpty());

		// 13. Iterator<E> iterator()
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// 14. int lastIndexOf(Object o)
		System.out.println(l.lastIndexOf(1));
		System.out.println(l.lastIndexOf(2));// -1

		// 15. ListIterator<E> listIterator();
		ListIterator<Integer> litr = l.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next() + "____");
			System.out.println(litr.nextIndex());
		}
		while (litr.hasPrevious()) {
			System.out.println(litr.previous() + "-----");
			System.out.println(litr.previousIndex());
		}

		// 16. ListIterator<E> listIterator(int index);
		ListIterator<Integer> litr2 = l.listIterator(5);
		while (litr2.hasNext()) {
			System.out.println(litr2.next() + "____");
			System.out.println(litr2.nextIndex());
		}

		// 17. Element remove(int index)
		System.out.println(l.remove(1));

		// 18. boolean remove(Object o)
		System.out.println(l.remove(2));
		System.out.println(l.remove(3));

		// 19. boolean removeAll(Collection<E> c)
		System.out.println(l2);
		l2.removeAll(l);
		System.out.println(l2);

		// 20. default void replaceAll(UnaryOperator<E> opr)
		List<String> c = new ArrayList<>();
		c.add("Bhanu");
		c.add("Bhanu");
		c.add("Bhanu");
		System.out.println("Original list: " + c);
		// Use replaceAll with a lambda expression to convert to lowercase
		c.replaceAll(e -> e.toLowerCase());
		System.out.println("Modified list: " + c);

		// 21. boolean retainAll(Collection<?> c)
		List<String> list1 = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five"));
		List<String> list2 = new ArrayList<>(Arrays.asList("four", "five", "six", "seven"));
		// Retain only elements in list1 that are also in list2
		boolean changed = list1.retainAll(list2);
		System.out.println("list1 after retainAll: " + list1); // Output: [four, five]
		System.out.println("Collection was changed: " + changed); // Output: true

		// 22. Element set(int index,E element)
		// Replaces the element at the specified position in this list with the
		// specified
		// element
		l2.add(5);
		System.out.println(l2);
		l2.set(1, 8);
		l2.set(4, 1);
		System.out.println(l2);

		// 23. default void sort(Comparator<? super E> c)
		List<String> fruits = new ArrayList<>();
		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Kiwi");
		fruits.add("Banana");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println("***************");
		// Sort using a custom comparator (lambda expression) to sort by length
		fruits.sort(Comparator.comparingInt(String::length));
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// 24. Spliterator spliterator()
		Spliterator<Integer> sp = l.spliterator();
		while (sp.tryAdvance((element) -> System.out.print(element + " ")))
			;
		System.out.println();
		
		//25. List<E> subList(int fromIndex, int toIndex)
		List<Integer> l3 = l.subList(3, 5);
		System.out.println(l3);
		
		// 26. Object[] toArray()
		Object[] arr = l2.toArray();
		for (Object o : arr) {
			System.out.print(o + " ");
		}
		System.out.println();
		// 27. <T> T[] toArray(T[] a)
		Integer[] sarr = l.toArray(new Integer[0]);
		for (Integer i : sarr) {
			System.out.print(i + " ");
		}
	}

}
