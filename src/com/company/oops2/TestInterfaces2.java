package com.company.oops2;

public class TestInterfaces2 {
	public static void main(String[] args) {
		Hawk hawk = new Hawk();
		hawk.hunt();

		Rabbit rabbit = new Rabbit();
		rabbit.flee();

		Predator predatorFish = new Fish();
		predatorFish.hunt();

		Prey preyFish = new Fish();
		preyFish.flee();

	}
}
