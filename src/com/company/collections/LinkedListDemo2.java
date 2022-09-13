package com.company.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		list.add("hello");
		list.add(new StringBuilder("hi").toString());
		list.add("helo");

		// list.forEach(System.out::println);

		Deque<String> list2 = new LinkedList<>();
		list2.add("hsbc");
		list2.add("dbs");
		list2.add("sbi");
		list2.add("citybank");
		list2.add("mh");

		list2.addFirst("hdfc");
		list2.addLast("icici");

		// System.out.println(list2.pollFirst());
		// System.out.println(list2.pollLast());

		// display strings which are starting with 'h' and convert them into uppercase
		// list2.stream().filter(e -> e.charAt(0) == 'h').map(e ->
		// e.toUpperCase()).forEach(System.out::println);

		LinkedList<Emp> emps = new LinkedList<>();

		emps.add(new Emp(101, "neha", "neha@email.com"));
		emps.add(new Emp(102, "nawaz", "nawaz@email.com"));
		emps.add(new Emp(103, "nupur", "nupur@email.com"));
		emps.add(new Emp(104, "radha", "radha@email.com"));
		emps.add(new Emp(105, "santosh", "santosh@email.com"));

		emps.offerFirst(new Emp(109, "kalai", "kalai@email.com"));
		System.out.println(emps.peekLast());

		emps
		.stream()
		.filter(e -> (e.getName().charAt(0) == 'n'))
		.map(e -> e.getName())
		.forEach(System.out::println);

	}

}
