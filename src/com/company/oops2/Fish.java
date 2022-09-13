package com.company.oops2;

public class Fish implements Prey, Predator {

	@Override
	public void hunt() {
		System.out.println("Predator Fish must hunt to suvive!");
	}

	@Override
	public void flee() {
		System.out.println("Prey Fish must flee to survive");
	}

}
