package com.company.exceptions;

public class ExceptionDemo {
	public static void main(String[] args) throws Address {
		try {
			throw new Address();
		} catch (RuntimeException exception) {
			System.out.println(exception);
		}
	}
}

class Address extends Exception {

}
