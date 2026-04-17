package com.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo3 implements Cloneable {

//	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// exclusive ArrayList class Methods

		// 1. Object clone()
		// returns a shallow copy of ArrayList Instance
		List<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

//		ArrayList<String> cars2 = (ArrayList<String>) cars.clone();
//		cars2.set(0, "Toyota");
//
//		System.out.println(cars);
//		System.out.println(cars2);
//		System.out.println(cars.size());
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Volvo");
		cars.add("BMW");
		System.out.println(cars.size());
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Mazda");
		System.out.println(cars.size());

//		// 2. void ensureCapacity(int minCapacity)
//		cars.ensureCapacity(10);
//		System.out.println(cars.size());
//
//		// 3. boolean removeIf(Predicate<? super E> filter)
//		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//		// Remove all even numbers
//		numbers.removeIf(n -> n % 2 == 0); 
//		
//		// 4. protected void removeRange(int fromIndex, int toIndex)
//		
//		// 5. void trimToSize()
//		// it will reduce the capacity to the list size
//		cars.trimToSize();
//		System.out.println(cars.size());

	}

}
