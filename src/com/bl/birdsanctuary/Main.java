package com.bl.birdsanctuary;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.showUserMenu();

		/*
		 * Parrot parrot = new Parrot(); parrot.id = "pa001"; Ostrich ostrich = new
		 * Ostrich(); ostrich.id = "os001"; Duck duck = new Duck(); duck.id = "du001";
		 * Crow crow = new Crow(); crow.id = "cr001";
		 * 
		 * BirdSanctuaryRepository bird = new BirdSanctuaryRepository();
		 * 
		 * bird.add(parrot); bird.add(ostrich); bird.add(duck); bird.add(crow);
		 * 
		 * bird.print();
		 * 
		 * bird.remove(crow);
		 * 
		 * System.out.println("After Delete"); bird.print();
		 */
		System.out.println("Good Bye");
	}

	public void showUserMenu() {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		final int EXIT_VALUE = 8;

		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();

		while (choice != EXIT_VALUE) {
			System.out.println("Enter your option\n");
			System.out.println(
					"1)Add a Bird\n2)Remove a Bird\n3)Print the Bird\n4)Print Swimmable\n5)Print Flyable\n6)Print Eatable\n"
							+ "7)Edit Bird\n" + EXIT_VALUE + ")Exit\n");
			choice = scanner.nextInt();

			ViewLayer viewLayer = new ViewLayer();

			switch (choice) {
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
				// String birdname = scanner.nextLine();
				String birdname = scanner.next();
				Bird removeBird = birdSanctuaryRepository.getBird(birdname);
				birdSanctuaryRepository.remove(removeBird);
				break;
			case 3:
				viewLayer.print();
				break;
			case 4:
				viewLayer.printSwimmable();
				break;
			case 5:
				viewLayer.printFlyable();
				break;
			case 6:
				viewLayer.printEatable();
				break;
			case 7:
				editBird();
				break;
			case 8:
				break;
			}

		}
	}

	private void editBird() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Bird name to Edit");

		String birdname = scanner.next();

		Bird editBird = BirdSanctuaryRepository.getInstance().getBird(birdname);

		while (true) {
			System.out.println("1)Edit Bird Name\n2)Edit Bird ID\n3)Edit Bird Color\n4)Exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the New Name");
				String birdname1 = scanner.next();
				editBird.name = birdname1;
				break;
			case 2:
				System.out.println("Enter the New ID");
				String birdId = scanner.next();
				editBird.id = birdId;
				break;
			case 3:
				int count = 1;

				for (Bird.Color color : EnumSet.allOf(Bird.Color.class)) {
					System.out.println(count + " " + color);
					count++;
				}
				int choice2 = scanner.nextInt();

				int count1 = 1;

				for (Bird.Color color : EnumSet.allOf(Bird.Color.class)) {
					if (choice2 == count1) {
						editBird.color = color;
						break;
					}
					count1++;
				}
				break;
			case 4:
				return;
			}
		}
	}

}
