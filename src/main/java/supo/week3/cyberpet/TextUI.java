package supo.week3.cyberpet;

import java.util.Scanner;

public class TextUI implements UI {
	private Scanner scanner = new Scanner(System.in);

	public int getMenuOption(String[] options) {
		for (int index = 0; index < options.length; index++) {
			System.out.println("  " + Integer.toString(index) + " - " + options[index]);
		}
		int choice = -1;
		// keep looping until the input is within range
		while (choice < 0 || choice > options.length) {
			System.out.print("Enter choice: ");
			try {
				choice = Integer.valueOf(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid option");
			}
		}
		return choice;

	}

	public String getInput(String text) {
		System.out.print(text + " : ");
		return scanner.nextLine();
	}

	public void showOutput(String text) {
		System.out.println(text);
	}

	public void displayPetStatus(String name, int hunger, int tiredness) {
		System.out.println("");
		
		System.out.println(name + " status:");
		System.out.println("hunger: " + Integer.toString(hunger));
		System.out.println("tiredness: " + Integer.toString(tiredness));

		System.out.println("");
	}
}
