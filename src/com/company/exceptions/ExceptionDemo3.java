package com.company.exceptions;

public class ExceptionDemo3 {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class className = null;

		className = Class.forName("com.company.exceptions.A");

		A aObject;

		aObject = (A) className.newInstance();

		System.out.println(aObject.x);
	}
}

class A {
	int x = 10;
}
