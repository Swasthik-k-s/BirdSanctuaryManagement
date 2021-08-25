package com.bl.birdsanctuary;

public class Parrot extends Bird implements Flyable{
	Parrot() {
		color = Color.GREEN;
		name = "Parrot";
	}

	@Override
	public void fly() {
		System.out.println(name + " can Fly.");
	}

	@Override
	public void eat() {
		System.out.println(name + " can Eat.");
	}
}
