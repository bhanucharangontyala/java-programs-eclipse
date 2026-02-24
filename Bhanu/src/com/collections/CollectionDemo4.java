package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo4 {

	public static void main(String[] args) {
		// exclusive LinkedList class methods
		// linkedList internally implements doubly linkedList
		LinkedList<Integer> lk = new LinkedList<>();
		lk.add(9);
		lk.add(8);
		lk.add(1, 7);
		System.out.println(lk);
		// 1. void addFirst(E)
		lk.addFirst(1);
		lk.addFirst(2);
		System.out.println(lk);
		// 2. void addLast(E)
		lk.addLast(3);
		lk.addLast(4);
		System.out.println(lk);

		// 3. Iterator descendingIterator()
		Iterator<Integer> dit = lk.descendingIterator();
		while (dit.hasNext()) {
			System.out.println(dit.next());
		}
		System.out.println("*************");

		// 4. Element element()
		// Retrieves, but does not remove, the head (first element)
		// of this list.
		System.out.println(lk.element());
		System.out.println("*************");

		// 5. Element getFirst()
		System.out.println(lk.getFirst());
		System.out.println("*************");

		// 6. Element getLast()
		System.out.println(lk.getLast());
		System.out.println("*************");

		// 7. boolean offer(E e)
		lk.offer(22);
		System.out.println(lk);
		System.out.println("*************");

		// 8. boolean offerFirst(E e)
		lk.offerFirst(11);
		System.out.println(lk);
		System.out.println("*************");

		// 9. boolean offerLast(E e)
		lk.offerLast(44);
		System.out.println(lk);
		System.out.println("*************");

		// 10. Element peek()
		System.out.println(lk.peek());// returns first element but does not remove the element

		// 11. Element peekFirst()
		System.out.println(lk.peekFirst());// returns first element but does not remove the element

		// 12. Element peekLast()
		System.out.println(lk.peekLast());// returns last element but does not remove the element

		// 13. Element poll()
		System.out.println(lk.poll());// returns and removes the first element

		// 14. Element pollFirst()
		System.out.println(lk.pollFirst());// returns and removes the first element

		// 15. Element pollLast()
		System.out.println(lk.pollLast());// returns and removes the lasts element

		System.out.println(lk);
		// 16. Element pop()
		System.out.println(lk.pop());// returns and removes the first element

		// 17. void push(Element e)
		lk.push(32);
		System.out.println(lk);// adds element at start of the list

		// 18. Element remove()
		System.out.println(lk.remove());// remove element at start of the list
		System.out.println(lk);

		// 19. Element removeFirst()
		System.out.println(lk.removeFirst());

		lk.add(7);
		lk.add(7);
		lk.add(9);
		lk.add(9);
		lk.add(91);
		lk.add(23);
		
		// 20. boolean removeFirstOccurance(Object o)
		lk.removeFirstOccurrence(7);
		System.out.println(lk);
		
		// 21. Element removeLast()
		System.out.println(lk.removeLast());
		System.out.println(lk);
		
		// 22. boolean removeLastOccurance(Object o)
		lk.removeLastOccurrence(9);
		System.out.println(lk);
	}

}
