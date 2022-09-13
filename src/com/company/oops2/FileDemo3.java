package com.company.oops2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo3 {
	public static void main(String[] args) throws IOException {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader reader = new BufferedReader(new FileReader("hsbc.txt"));

		String message;

		while ((message = reader.readLine()) != null)
			System.out.println(message);

		reader.close();
	}
}
