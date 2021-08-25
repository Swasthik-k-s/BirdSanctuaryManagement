package com.bl.birdsanctuary;

public class Duck extends Bird implements Flyable, Swimmable{
	Duck() {
		color = Color.GREY;
		name = "Duck";
	}
	
	@Override
	public void fly() {
		System.out.println(name + " can Fly.");
	}

	@Override
	public void eat() {
		System.out.println(name + " can Eat.");
	}

	@Override
	public void swim() {
		System.out.println(name + " can Swim.");
	}
}
