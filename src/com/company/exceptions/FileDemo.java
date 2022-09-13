package com.company.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// getting fileoutputstream object
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("demo.txt", true);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage()); // disk drive message
		}

		// write content to the file demo.txt
		String message = "love the rains!!";

		byte[] bytes = message.getBytes();

		try {
			if (fos != null)
				fos.write(bytes); // NPE
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("File Write Successs!!");

	}

}
