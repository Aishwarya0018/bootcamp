package com.company.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;

public class CollectionDemo {

	public static void main(String[] args) {
		// super interface reference can refer to child object

		Collection collection = new ArrayList();

		collection.add(10); // Integer.valueOf(10);
		collection.add(20); // Integer.valueOf(20);
		collection.add("hi");
		collection.add("hello");
		collection.add(null);
		collection.add(null);
		collection.add(new StringBuilder("helow"));

		System.out.println("Size : " + collection.size());

		collection.stream().forEach(System.out::println); 

	}

}
