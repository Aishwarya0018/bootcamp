package com.company.oops2;

@FunctionalInterface
public interface Runner {
	void run(); // SAM
}

class TestInterfaces3 {
	public static void main(String[] args) {
		Runner runner = () -> System.out.println("lambda expression");
		runner.run();
	}
}

//declarative vs imperative
