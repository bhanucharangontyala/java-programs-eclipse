package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupEleSet {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<>();
		Set<Integer> res = new HashSet<>();
		Set<Integer> res2 = new HashSet<>();
		
		s.add(1);
		s.add(2);	
		s.add(3);
		s.add(1);
		s.add(2);
		s.add(9);
		s.add(4);
		s.add(9);
		
		for(Integer i :s) {
			if(!res.add(i)) {
				res2.add(i);
			}
		}
		System.out.println(res2);
		
	}

}
