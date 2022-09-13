package com.company.threads;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("emp.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Emp myEmp = (Emp) ois.readObject();

		System.out.println(myEmp);

		fis.close();
	}
}
