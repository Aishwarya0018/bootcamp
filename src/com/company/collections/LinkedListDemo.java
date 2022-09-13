package com.company.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Logger;

public class LinkedListDemo {

	public static final Logger LOGGER = Logger.getLogger("LinkedListDemo");

	public static void main(String[] args) {
		LOGGER.info("Working With LinkedList");

		LinkedList<Integer> listIntegers = new LinkedList<>();

		listIntegers.add(1);
		listIntegers.add(2);
		listIntegers.add(3);
		listIntegers.add(4);
		listIntegers.add(5);
		listIntegers.add(6);
		listIntegers.add(7);
		listIntegers.add(8);
		listIntegers.add(9);

		/*
		 * Iterator<Integer> iterator = listIntegers.iterator(); while
		 * (iterator.hasNext()) { Integer integer = iterator.next(); if (integer % 2 ==
		 * 0) System.out.println(integer); }
		 */

		// declarative programming or functional programming

		int sum = listIntegers
				.stream()
				.filter(n -> n % 2 == 0)
				.map(e -> e * e)
				.mapToInt(e -> e)
				.sum();
		
		LOGGER.info("Sum : " + sum);
	}

}


