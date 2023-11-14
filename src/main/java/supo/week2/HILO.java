package supo.week2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class ScoreData {
	public final String playerName;
	public final int difficulty;
	public final int guessesUsed;

	public ScoreData(String playerName, int difficulty, int guessesUsed) {
		this.playerName = playerName;
		this.difficulty = difficulty;
		this.guessesUsed = guessesUsed;
	}
}

class ScoreBoard {
	static ArrayList<ScoreData> scores = new ArrayList<ScoreData>();

	public static void storeScore(ScoreData data) {
		scores.add(data);
	}
}

public class HILO {
	private static int MAX = 100;
	private static Random generator = new Random();
	private static Scanner scanner = new Scanner(System.in);

	private String playerName;
	private int difficulty;
	private int guessesLeft;
	private int guessesUsed;
	private int value;
	private int guess;
	
	private HILO(String playerName, int difficulty) {
		this.playerName = playerName;
		this.difficulty = difficulty;
		guessesLeft = 5 + (3 - difficulty) * 2;
		guessesUsed = 0;
		value = generator.nextInt(MAX) + 1;
	}
	
	public void runRound() {
	    System.out.println("Enter guess:");
	    guess = Integer.parseInt(scanner.nextLine());
	    
    	guessesLeft--;
    	guessesUsed++;
	    
	    if (guess == value) {
		    System.out.println("Correct");
		    return;
	    }
	   
	    if (guess > value) {
	    	System.out.println("Go lower");
	    } else if (guess < value) {
	    	System.out.println("Go higher");
	    }
    	System.out.println(Integer.toString(guessesLeft) + " guesses left.");
	}
	
	public boolean isOver() {
		return guessesLeft == 0 || guess == value;
	}
	
	public static void main(String[] args) {
	    System.out.println("Enter username: ");
	    String playerName = scanner.nextLine();
	    	    
	    while (true) {
		    System.out.println("Enter difficulty (1-3):");
		    int difficulty = Integer.parseInt(scanner.nextLine());
		    HILO game = new HILO(playerName, difficulty);

			while (!game.isOver()) {
				game.runRound();
			}

			ScoreBoard.storeScore(new ScoreData(playerName, game.difficulty, game.guessesUsed));

		    System.out.println("Play again? (y/n): ");
		    String line = scanner.nextLine().trim();
		    System.out.println(line.charAt(0));
		    System.out.println(line == "y");
		    System.out.println(line == "y\n");
			if (scanner.nextLine() != "y") {
				return;
			}
	    }
	}
}