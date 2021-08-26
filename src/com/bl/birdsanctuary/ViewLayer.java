package com.bl.birdsanctuary;

public class ViewLayer{
	public void print() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird bird: birdSanctuaryRepository.getAllBirds()) {
			System.out.println(bird);
		}
	}
	
	public void printFlyable() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird bird: birdSanctuaryRepository.getAllBirds()) {
			if(bird.canFly)
				bird.fly();
		}
	}
	
	public void printEatable() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird bird: birdSanctuaryRepository.getAllBirds()) {
			bird.eat();
		}
	}
	
	public void printSwimmable() {
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		for(Bird bird: birdSanctuaryRepository.getAllBirds()) {
			if(bird.canSwim) {
				bird.swim();
			}
			
		}
	}
}
