package com.bl.birdsanctuary;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Parrot parrot = new Parrot();
		parrot.id = "pa001";
		Ostrich ostrich = new Ostrich();
		ostrich.id = "os001";
		Duck duck = new Duck();
		duck.id = "du001";
		Crow crow = new Crow();
		crow.id = "cr001";
		
		BirdSanctuaryRepository bird = new BirdSanctuaryRepository();
		
		bird.add(parrot);
		bird.add(ostrich);
		bird.add(duck);
		bird.add(crow);
		
		bird.print();
	}

}
