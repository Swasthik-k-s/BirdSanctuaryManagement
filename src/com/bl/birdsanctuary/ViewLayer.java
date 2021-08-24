package com.bl.birdsanctuary;

public class ViewLayer {
	public void print() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird item: birdSanctuaryRepository.getAllBirds()) {
			System.out.println(item);
		}
	}
	
	public void printFlyable() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird item: birdSanctuaryRepository.getAllBirds()) {
			item.fly();
		}
	}
	
	public void printEatable() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird item: birdSanctuaryRepository.getAllBirds()) {
			item.eat();
		}
	}
	
	public void printSwimmable() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird item: birdSanctuaryRepository.getAllBirds()) {
			item.swim();
		}
	}
}
