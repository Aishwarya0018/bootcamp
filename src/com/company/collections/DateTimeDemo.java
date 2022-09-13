package com.company.collections;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(formatter.format(date));

	}

}
