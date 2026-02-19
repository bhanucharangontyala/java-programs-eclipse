package com.collections;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.Iterator;

public class Collection1 {

	public static void main(String[] args) {
		Collection<Integer> sal = new ArrayList<>();
		sal.add(1000);
		sal.add(2000);
		sal.add(3400);
		sal.add(5400);
		sal.add(9400);
		sal.add(3400);
		sal.add(5500);
		sal.add(4000);

//		Iterator<Integer> it = sal.iterator();
//		Integer max = 0;
//		while (it.hasNext()) {
//			if (it.next() > max) {
//				max = it.next();
//			}
//		}
		
		Integer max =0;
		for(Integer sal1:sal) {
			if(sal1 > max) {
				max = sal1;
			}
		}

		System.out.println(max);
	}

}
