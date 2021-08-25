package com.bl.birdsanctuary;

public class Crow extends Bird implements Flyable{
	Crow() {
		color = Color.BLACK;
		name = "Crow";
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
