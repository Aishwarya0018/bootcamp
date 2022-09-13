package com.company.oops2;

public class TestInterfaces {

	public static void main(String[] args) {
		Demo demo = new Demo();

		Walkable walkable = null;

		walkable = demo;

		// walkable.run();
		walkable.walk();
		// walkable.foo();

		Runnable runnable = null;
		runnable = demo;
		runnable.run();
	}

}
