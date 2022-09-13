package com.company.business;

public class Demo {
	private int x;

	Demo(int x) {
		this.x = x;
	}

	public String toString() {
		return "x : " + x;
	}

}

class DemoTest {
	public static void main(String[] args) {
		Demo demo = new Demo(11);
		System.out.println(demo);
	}

}
