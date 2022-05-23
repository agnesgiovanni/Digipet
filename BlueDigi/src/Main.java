import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Digipet> digipet = new ArrayList<>();
	Bunny bunny = new Bunny("Tokki", 10, 10, 10, 2);
	Tortoise tor = new Tortoise("Daedae", 10, 10, 10, 3);
	
	public Main() {
		// TODO Auto-generated constructor stub
		int choose;
		
		digipet.add(bunny);
		digipet.add(tor);
		
		do {
			menu();
			
			choose = scan.nextInt();
			scan.nextLine();
			
			switch (choose) {
			case 1:
				//Play
				play();
				break;

			case 2:
				//Eat
				eat();
				break;
				
			case 3:
				//Bath
				bath();
				break;
				
			case 4:
				//Exit
				status();
				System.out.println("Bye Bye!");
				System.out.println("Thank you for playing with Digipet!");
				System.out.println("We have so much fun :)");
				break;
			}
			
			
			
		} while (choose != 4);
	}



	private void bath() {
		// TODO Auto-generated method stub
		String name, voice;
		int happiness, health, cleanness, ears,  index = 0;
		
		status();
		
		do {
			System.out.print("Choose Digipet that you want to bath [Tortoise | Bunny] (case sensitive) : ");
			name = scan.nextLine();
		} while (!name.equals("Tortoise") && !name.equals("Bunny"));
		
		name = digipet.get(index).getName();
		happiness = digipet.get(index).getHappiness();
		health = digipet.get(index).getHealth();
		cleanness = digipet.get(index).getCleanness();
		//voice = digipet.get(index).voice();
		
		if (name.equals("Bunny")) {
			index = 0;
		} else {
			index = 1;
		}
		
		if (index == 0) {
			
			happiness = happiness - 1;
			health = health - 1;
			cleanness = cleanness + 3;
			
			digipet.get(index).setName(name);
			digipet.get(index).setHappiness(happiness);
			digipet.get(index).setHealth(health);
			digipet.get(index).setCleanness(cleanness);
			digipet.get(index).voice();
			System.out.println("Tokki is clean now! Tokki is hungry!");
			
			System.out.println("Press enter to play more...");
			scan.nextLine();
			
			
		} else {
			
			happiness = happiness - 1;
			health = health - 1;
			cleanness = cleanness + 3;
			
			digipet.get(index).setName(name);
			digipet.get(index).setHappiness(happiness);
			digipet.get(index).setHealth(health);
			digipet.get(index).setCleanness(cleanness);
			digipet.get(index).voice();
			System.out.println("Daedae is clean now! Daedae is hungry!");
			
			System.out.println("Press enter to play more...");
			scan.nextLine();
			
		}
	}


	private void eat() {
		// TODO Auto-generated method stub
		String name, food, voice;
		int happiness = 0, health = 0, cleanness = 0, index = 0;
		
		status();
		
		do {
			System.out.print("Choose Digipet that you want to fed [Tortoise | Bunny] (case sensitive) : ");
			name = scan.nextLine();
		} while (!name.equals("Tortoise") && !name.equals("Bunny"));
		
		do {
			System.out.print("Choose food that you Digipet want ot eat [Corn | Tomato | Carrot | Apple | Mango] (case sensitive) : ");
			food = scan.nextLine();
		} while (!(food.equals("Corn") || food.equals("Tomato") || food.equals("Apple") || food.equals("Mango")));
		
		name = digipet.get(index).getName();
		happiness = digipet.get(index).getHappiness();
		health = digipet.get(index).getHealth();
		cleanness = digipet.get(index).getCleanness();
		//voice = digipet.get(index).voice();
		
		if (name.equals("Bunny")) {
			index = 0;
		} else {
			index = 1;
		}
		
		if (index == 0) {
			
			happiness = happiness - 1;
			health = health + 3;
			cleanness = cleanness - 1;
			
			digipet.get(index).setName(name);
			digipet.get(index).setHappiness(happiness);
			digipet.get(index).setHealth(health);
			digipet.get(index).setCleanness(cleanness);
			digipet.get(index).voice();
			System.out.println("Tokki belly is about to bloat! Tokki need a bath!");
			
			System.out.println("Press enter to play more...");
			scan.nextLine();
			
		} else {
			
			happiness = happiness - 1;
			health = health + 3;
			cleanness = cleanness - 1;
			
			digipet.get(index).setName(name);
			digipet.get(index).setHappiness(happiness);
			digipet.get(index).setHealth(health);
			digipet.get(index).setCleanness(cleanness);
			digipet.get(index).voice();
			System.out.println("Daedae belly is about to bloat! Daedae need a bath!");

			System.out.println("Press enter to play more...");
			scan.nextLine();
			
		}
	}

	private void play() {
		// TODO Auto-generated method stub
		String name, voice;
		int happiness, health, cleanness, ears, index = 0;
		
		status();
		
		System.out.println("Lets know more about you Digital Pet !");
		System.out.println("======================================");
		System.out.println("Your Bunny name is Tokki\nYour Tortoise name is Daedae");
		System.out.println("- Daedae have 3 ears,\n  2 ears located on the side of the head with a small hole and the other is located inside the nose.");
		System.out.println("- Tokki have 2 ears located on the side of the head, my ears are longer and erect than other animals.\n");
		
		do {
			System.out.print("Choose Digipet that you want ot play with [Tortoise | Bunny] (case sensitive) : ");
			name = scan.nextLine();
		} while (!name.equals("Tortoise") && !name.equals("Bunny"));

		System.out.println("\n");
		
		if (name.equals("Bunny")) {
			index = 0;
		} else {
			index = 1;
		}
		
		name = digipet.get(index).getName();
		happiness = digipet.get(index).getHappiness();
		health = digipet.get(index).getHealth();
		cleanness = digipet.get(index).getCleanness();
//		voice = digipet.get(index).voice();
		
		
		if (index == 0) {
			
			happiness = happiness + 3;
			
			health = health - 1;
			
			cleanness = cleanness - 1;
			
			digipet.get(index).setName(name);
			digipet.get(index).setHappiness(happiness);
			digipet.get(index).setHealth(health);
			digipet.get(index).setCleanness(cleanness);
			digipet.get(index).voice();
			System.out.println("Tokki is dirty, need to take a bat ASAP! Tokki also hungry, tokki want to eat!");

			System.out.println("Press enter to play more...");
			scan.nextLine();
			
			
			
		} else {
			
			
			happiness = happiness + 3;
			health = health - 1;
			cleanness = cleanness - 1;
			
			digipet.get(index).setName(name);
			digipet.get(index).setHappiness(happiness);
			digipet.get(index).setHealth(health);
			digipet.get(index).setCleanness(cleanness);
			digipet.get(index).voice();
			System.out.println("Daedae is dirty, need to take a bath ASAP! Daedae also hungry, Daedae want to eat!");

			System.out.println("\nPress enter to play more...");
			scan.nextLine();
			
		}
		
		
	}
	
	private void status() {
		System.out.println("=====================");
		System.out.println("Your Digipet Status !");
		System.out.println("=====================");
		for (int i = 0; i < digipet.size(); i++) {
			System.out.printf("Name        : %s\n", digipet.get(i).getName());
			System.out.printf("Happiness   : %d\n", digipet.get(i).getHappiness());
			System.out.printf("Health      : %d\n", digipet.get(i).getHealth());
			System.out.printf("Cleanness   : %d\n", digipet.get(i).getCleanness());
			System.out.println("=====================");
			
		}
		
	}

	private void menu() {
		// TODO Auto-generated method stub
		System.out.println("=======================");
		System.out.println("  Welcome to BlueDigi");
		System.out.println("   Your Digital Pet");
		System.out.println("Lets play with Digipet!");
		System.out.println("=======================");
		System.out.println("=======================");
		System.out.println("1. Play");
		System.out.println("2. Eat");
		System.out.println("3. Bath");
		System.out.println("4. Exit");
		System.out.println("=======================\n");
		
		System.out.print("Choice >> ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
