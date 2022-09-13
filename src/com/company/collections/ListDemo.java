package com.company.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("hello");
		list.add("10");
		list.add("20");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string.toUpperCase());
		}

	}
}
