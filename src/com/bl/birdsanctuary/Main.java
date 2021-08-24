package com.bl.birdsanctuary;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.showUserMenu();

		/*Parrot parrot = new Parrot();
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

		bird.remove(crow);

		System.out.println("After Delete");
		bird.print();
		 */
		System.out.println("Good Bye");
	}

	public void showUserMenu() {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		final int EXIT_VALUE = 7;
		
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
				
		while (choice != EXIT_VALUE) {
			System.out.println("Enter your option\n");
			System.out.println("1)Add a Bird\n2)Remove a Bird\n3)Print the Bird\n4)Print Swimmable\n5)Print Flyable\n6)Print Eatable\n" + EXIT_VALUE +")Exit\n");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				Parrot parrot = new Parrot();
				parrot.id = "pa001";
				Ostrich ostrich = new Ostrich();
				ostrich.id = "os001";
				Duck duck = new Duck();
				duck.id = "du001";
				Crow crow = new Crow();
				crow.id = "cr001";
				Crow crow2 = new Crow();
				crow.id = "cr002";
				Crow crow3 = new Crow();
				crow.id = "cr002";

				birdSanctuaryRepository.add(parrot);
				birdSanctuaryRepository.add(ostrich);
				birdSanctuaryRepository.add(duck);
				birdSanctuaryRepository.add(crow);
				birdSanctuaryRepository.add(crow2);
				birdSanctuaryRepository.add(crow3);
				break;
			case 2:
				System.out.println("Enter the bird name to remove\n");
				String birdname = scanner.nextLine();
				birdname = scanner.next();
				Bird removeBird = birdSanctuaryRepository.getBird(birdname);
				birdSanctuaryRepository.remove(removeBird);
				break;
			case 3:
				ViewLayer viewLayer = new ViewLayer();
				viewLayer.print();
				break;
			case 4:
				viewLayer = new ViewLayer();
				viewLayer.printSwimmable();
				break;
			case 5:
				viewLayer = new ViewLayer();
				viewLayer.printFlyable();
				break;
			case 6:
				viewLayer = new ViewLayer();
				viewLayer.printEatable();
				break;
			case 7:
				break;
			}
		}
	}

}
