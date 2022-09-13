package com.company.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		TreeSet<Emp> emps = new TreeSet<>(new EmpNameComparator());
		// TreeSet<Emp> emps = new TreeSet<>((o1, o2) ->
		// o1.getName().compareTo(o2.getName()));
		// TreeSet<Emp> emps = new TreeSet<>(Comparator.reverseOrder());
		emps.add(new Emp(101, "neha", "neha@email.com"));
		emps.add(new Emp(101, "neha", "neha@email.com"));
		emps.add(new Emp(102, "nawaz", "nawaz@email.com"));
		emps.add(new Emp(103, "nupur", "nupur@email.com"));
		emps.add(new Emp(104, "radha", "radha@email.com"));
		emps.add(new Emp(105, "santosh", "santosh@email.com"));
		emps.add(new Emp(105, "santosh", "santosh@email.com"));

		emps.forEach(System.out::println);
	}

}

class EmpNameComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getName().compareTo(o2.getName());
	}

}