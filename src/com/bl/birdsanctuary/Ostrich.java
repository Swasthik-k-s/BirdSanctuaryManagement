package com.bl.birdsanctuary;

public class Ostrich extends Bird {
	Ostrich() {
		color = Color.WHITE;
		name = "Ostrich";
	}

	@Override
	public void eat() {
		System.out.println(name + " can Eat.");
	}
}
