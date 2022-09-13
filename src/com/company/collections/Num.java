package com.company.collections;

public class Num<T extends Number> {

	private T t;

	Num(T t) {
		this.t = t;
	}

	public void show() {
		System.out.println("Num : " + t);
	}
}
