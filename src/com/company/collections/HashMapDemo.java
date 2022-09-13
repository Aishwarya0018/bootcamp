package com.company.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("india", 1);
		map.put("australia", 2);
		map.put("pakistan", 3);
		map.put("england", 4);
		map.put("newzealand", 5);

		System.out.println("India Rank : " + map.get("india"));
		map.entrySet().stream().forEach(System.out::println);
	}
}
