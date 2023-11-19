package supo.week3.cyberpet;

public class CyberPetGame {
	private static String[] petOptions = { "Dog", "Fish", "Ninja" };
	private static String[] interactionOptions = { "Play", "Feed", "Sleep" };

	private UI ui = new TextUI();
	private Pet pet;

	private CyberPetGame() {
	}

	void createPet() {
		int petNumber = ui.getMenuOption(petOptions);
		String petName = ui.getInput("Enter name for your " + petOptions[petNumber]);

		switch (petNumber) {
		case 0:
			pet = new Dog(petName);
			break;
		case 1:
			pet = new Fish(petName);
			break;
		case 2:
			pet = new Ninja(petName);
			break;
		}
	}

	public void loop() {
		if (pet == null) {
			createPet();
		}

		ui.showOutput("What would you like to do with your pet?");
		switch (ui.getMenuOption(interactionOptions)) {
		case 0:
			pet.play();
			break;
		case 1:
			pet.feed();
			break;
		case 2:
			pet.sleep();
			break;
		}

		ui.displayPetStatus(pet.getName(), pet.getHunger(), pet.getTiredness());

		if (pet.isDead()) {
			ui.showOutput("Your pet has died");
			pet = null;
		}
	}

	public static void runGame() {
		CyberPetGame game = new CyberPetGame();
		while (true) {
			game.loop();
		}
	}

	public static void main(String[] args) {
		runGame();
	}
}
