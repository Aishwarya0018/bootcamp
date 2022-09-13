package com.company.oops2;

public class Demo extends BaseDemo implements Runnable, Walkable {

	@Override
	public void walk() {
		System.out.println("walk...");
	}

	@Override
	public void run() {
		System.out.println("run...");
	}

}
