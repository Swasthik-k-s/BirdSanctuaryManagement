package com.bl.birdsanctuary;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.showUserMenu();
		System.out.println("Good Bye");
	}

	public void showUserMenu() {
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		final int EXIT_VALUE = 8;

		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();

		while (choice != EXIT_VALUE) {
			System.out.println("\nEnter your option");
			System.out.println(
					"1)Add a Bird\n2)Remove a Bird\n3)Print the Bird\n4)Print Swimmable\n5)Print Flyable\n6)Print Eatable\n"
							+ "7)Edit Bird\n" + EXIT_VALUE + ")Exit\n");
			choice = scanner.nextInt();

			ViewLayer viewLayer = new ViewLayer();

			switch (choice) {
			case 1:
				addTemporaryBirds();
				addBird();
				break;
			case 2:
				System.out.println("Enter the bird name to remove\n");
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

	private void addTemporaryBirds() {
		Bird duck = new Bird();
		duck.id = "du001";
		duck.name = "Duck";
		duck.color = Bird.Color.GREY;
		duck.canFly = false;
		duck.canSwim = true;
		BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
		birdSanctuaryRepository.add(duck);
		
		Bird ostrich = new Bird();
		ostrich.id = "os001";
		ostrich.name = "Ostrich";
		ostrich.color = Bird.Color.WHITE;
		ostrich.canFly = false;
		ostrich.canSwim = false;
		birdSanctuaryRepository.add(ostrich);
		
		Bird parrot = new Bird();
		parrot.id = "pa001";
		parrot.name = "Parrot";
		parrot.color = Bird.Color.GREEN;
		parrot.canFly = true;
		parrot.canSwim = false;
		birdSanctuaryRepository.add(parrot);
		
		Bird crow = new Bird();
		crow.id = "cr001";
		crow.name = "Crow";
		crow.color = Bird.Color.BLACK;
		crow.canFly = true;
		crow.canSwim = false;
		birdSanctuaryRepository.add(crow);
	}

	private void addBird() {
		Scanner scanner = new Scanner(System.in);
		Bird addBird = new Bird();
		System.out.println("Enter the ID");
		String id = scanner.nextLine();
		addBird.id = id;
		System.out.println("Enter the Name");
		String name = scanner.nextLine();
		addBird.name = name;
		System.out.println("Enter the Color");
		int count = 1;

		for (Bird.Color color : EnumSet.allOf(Bird.Color.class)) {
			System.out.println(count + " " + color);
			count++;
		}
		int choice2 = scanner.nextInt();

		int count1 = 1;

		for (Bird.Color color : EnumSet.allOf(Bird.Color.class)) {
			if (choice2 == count1) {
				addBird.color = color;
				break;
			}
			count1++;
		}
		System.out.println("Can the Bird Fly?");
		Boolean canFly = scanner.nextBoolean();
		addBird.canFly = canFly;
		System.out.println("Can the Bird Swim?");
		Boolean canSwim = scanner.nextBoolean();
		addBird.canSwim = canSwim;
		BirdSanctuaryRepository.getInstance().add(addBird);
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
