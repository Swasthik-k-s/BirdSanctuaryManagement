package com.bl.birdsanctuary;

public class ViewLayer{
	public void print() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird item: birdSanctuaryRepository.getAllBirds()) {
			System.out.println(item);
		}
	}
	
	public void printFlyable() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird item: birdSanctuaryRepository.getAllBirds()) {
			if(item instanceof Flyable) {
				//((Flyable) item).fly();
				Flyable flyable = (Flyable) item;
				flyable.fly();
			}
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
			if(item instanceof Swimmable) {
				Swimmable swimmable = (Swimmable) item;
				swimmable.swim();
			}
		}
	}
}
