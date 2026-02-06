package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ArrayList1 {

	public static void main(String[] args) {
		System.out.println("Array List");
		List<String> l1 = new ArrayList<>();
		l1.add("Bhanu");
		l1.add("Bhanu");
		l1.add("Charan");
		System.out.println(l1.size());
		System.out.println(l1.get(0));
		System.out.println(l1.contains("Bhanu"));

		Iterator<String> i1 = l1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("Linked List");
		List<Integer> lk1 = new LinkedList<>();
		lk1.add(1);
		lk1.add(2);
		lk1.add(3);
		lk1.add(4);
		lk1.add(5);
		System.out.println(lk1);
		System.out.println(lk1.size());
		System.out.println(lk1.get(2));
		System.out.println(lk1.set(3, 10));
		System.out.println(lk1.contains(3));
		System.out.println(lk1);
		
		System.out.println("Hash Set");
		Set<String> s1 = new HashSet<>();
		s1.add("Bhanu");
		s1.add("Bhanu");
		s1.add("Charan");
		s1.add("Gontyala");
		System.out.println(s1);
		System.out.println(s1.size());
		System.out.println(s1.contains("Charan"));
		
		System.out.println("Tree Set");
		Set<String> ts1 = new TreeSet<>();
		ts1.add("Bhanu");
		ts1.add("Bhanu");
		ts1.add("Charan");
		ts1.add("Gontyala");
		System.out.println(ts1);
		System.out.println(ts1.size());
		System.out.println(ts1.contains("Charan"));
		
		System.out.println("Hash Map");
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "Charan");
		m1.put(2, "Charan");
		m1.put(null, null);
		m1.put(5, null);
		m1.put(2, "Bhanu");// ignored
		m1.put(3, "Bhanu");
		m1.put(4, "Gotyala");
		m1.put(4, "Gotyala");// ignored
		System.out.println(m1);
		System.out.println(m1.size());
		System.out.println(m1.get(2));
		System.out.println(m1.containsKey(3));
		System.out.println(m1.containsValue("Bhanu"));
		System.out.println(m1.put(4, "Uzumaki"));
		System.out.println(m1);
		System.out.println("Tree Map");
		Map<Integer, String> tm1 = new TreeMap<>();
		tm1.put(1, "Charan");
		tm1.put(2, "Charan");
//		tm1.put(null, null);// NullPointerException
		tm1.put(5, null);
		tm1.put(2, "Bhanu");
		tm1.put(3, "Bhanu");
		tm1.put(4, "Gotyala");
		tm1.put(4, "Gotyala");// ignored
		System.out.println(tm1);
		System.out.println(tm1.size());
		System.out.println(tm1.get(2));
		System.out.println(tm1.containsKey(3));
		System.out.println(tm1.containsValue("Bhanu"));
		System.out.println(tm1.put(4, "Uzumaki"));
		System.out.println(tm1);

	}

}
