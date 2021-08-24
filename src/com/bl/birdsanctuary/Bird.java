package com.bl.birdsanctuary;

public abstract class Bird{
	String id;
	String color;
	
	@Override
	public String toString() {
		return "Bird [id=" + id + ", color=" + color + "]";
	}
}
