package com.company.exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("hsbc.txt"));

		writer.write("hey there, learning java is fun!!");
		writer.write("\n We're playing for  \\n  the third position!!");

		writer.close();

	}

}
