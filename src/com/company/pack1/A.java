package com.company.pack1;

public class A {
	private int x = 10;
	protected int y = 20;
	public int m = 30;
	int n = 50; //package-private

	public static void main(String[] args) {
		A aObject = new A();

		System.out.println(aObject.x);
		System.out.println(aObject.y);
		System.out.println(aObject.m);
		System.out.println(aObject.n);
	}
}