package com.company.exceptions;

import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 2 Numbers >>>");
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		System.out.println("Result : " + (m / n));
	}

}
