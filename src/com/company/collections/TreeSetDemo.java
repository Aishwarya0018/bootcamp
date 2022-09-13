package com.company.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Emp> emps = new TreeSet<>();

		emps.add(new Emp(101, "neha", "neha@email.com"));
		emps.add(new Emp(101, "neha", "neha@email.com"));
		emps.add(new Emp(102, "nawaz", "nawaz@email.com"));
		emps.add(new Emp(103, "nupur", "nupur@email.com"));
		emps.add(new Emp(104, "radha", "radha@email.com"));
		emps.add(new Emp(105, "santosh", "santosh@email.com"));
		emps.add(new Emp(105, "santosh", "santosh@email.com"));

		emps.forEach(System.out::println);
		
		
		TreeSet<String> strings = new TreeSet<>();
		strings.add("usa");
		strings.add("india");
		strings.add("afghanistan");
		strings.add("srilanka");
		strings.add("pakistan");
		
		strings.forEach(System.out::println);
	}

}
