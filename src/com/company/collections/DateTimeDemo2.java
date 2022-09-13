package com.company.collections;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeDemo2 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate date2 = date.plusDays(3);
		LocalDate date3 = date.plusYears(2);

		System.out.println(date3);

		LocalDate d5 = LocalDate.of(2022, 8, 15);
		System.out.println(d5);

		System.out.println(d5.getDayOfWeek());

		ZonedDateTime d6 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(d6);

	}

}
