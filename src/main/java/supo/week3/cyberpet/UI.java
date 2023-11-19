package supo.week3.cyberpet;

public interface UI {
	int getMenuOption(String[] options);
	
	String getInput(String text);

	void showOutput(String text);

	void displayPetStatus(String name, int hunger, int tiredness);
}
