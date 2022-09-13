package com.company.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();

		hashSet.add("hi");
		hashSet.add("do");
		hashSet.add("me");
		hashSet.add(10);
		hashSet.add(true);
		hashSet.add(null);
		hashSet.add(null);
		hashSet.add("hello");
		hashSet.add("hello");
		System.out.println("HashSet Size : " + hashSet.size());

		HashSet<Emp> emps = new HashSet<>();
		emps.add(new Emp(101, "neha", "neha@email.com"));
		emps.add(new Emp(101, "neha", "neha@email.com"));
		emps.add(new Emp(102, "nawaz", "nawaz@email.com"));
		emps.add(new Emp(103, "nupur", "nupur@email.com"));
		emps.add(new Emp(104, "radha", "radha@email.com"));
		emps.add(new Emp(105, "santosh", "santosh@email.com"));
		emps.add(new Emp(105, "santosh", "santosh@email.com"));

		//make changes in the code only accept unique Emp objects
		System.out.println("Employees Size : " + emps.size());
		emps.forEach(System.out::println);
	}

}
