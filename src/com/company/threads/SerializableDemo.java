package com.company.threads;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) throws IOException {

		Emp emp = new Emp(101, "raza");

		FileOutputStream fos = new FileOutputStream("emp.txt");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(emp);

		oos.close();
		fos.close();

	}

}
