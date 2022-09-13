package com.company.collections;

public class GenericsDemo {

	public static void main(String[] args) {
		Num<Integer> num = new Num<>(5);
		num.show();

		Num<Double> doubleNum = new Num<>(4.3);
		doubleNum.show();

		Num<Byte> byteNum = new Num<>((byte) 10);
		byteNum.show();

		Num<Number> num2 = new Num<Number>(12.5f);
		num2.show();
		// Num<String> strNum = new Num<String>("hello");
		// strNum.show();
	}

}
