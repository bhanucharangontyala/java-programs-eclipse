package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {

	public static void main(String[] args) {
		List<Character> lc = new ArrayList<>();
		List<Character> lx = new ArrayList<>();
		lx.add('M');
		lx.add('N');
		lx.add('O');
		lx.add('P');
		lx.add('Q');
		lx.add('R');
		lx.add('S');
		lx.add('T');
		// adding the element sin various places of the list
		lc.add('B');
		lc.add('C');
		lc.add('E');
		System.out.println(lc);
		lc.add(0, 'A');// adding at start using index
		lc.addFirst('A');
		System.out.println(lc);
		lc.add(4, 'D');// adding at middle of the element
		System.out.println(lc);
		lc.add('F');// adding the element at the last
		lc.addLast('G');
		System.out.println(lc);
		lc.addAll(lx);
		System.out.println(lc);

		// removing the elements from the various positions of the list
		
		lc.removeFirst();// removing the elements from starting of the list
		System.out.println(lc);

		lc.remove(3);// removing by using the index
		System.out.println(lc);
		Object o = 'F';
		lc.remove(o);// removing by using the Object
		System.out.println(lc);
		
		lc.removeAll(lx);// removing the lx elements from lc
		System.out.println(lc);
		
		lc.removeLast();// removes the last element of the list
		System.out.println(lc);
		

	}

}
