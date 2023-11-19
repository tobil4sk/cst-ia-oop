package supo.week3.cyberpet;

public abstract class Pet {
	private static int MAX_STAT = 100;
	
	protected int hunger = 0;
	protected int tiredness = 0;
	private String name;

	public Pet(String name) {
		this.name = name;
	}

	public boolean isDead() {
		return hunger == MAX_STAT && tiredness == MAX_STAT;
	}

	public int getHunger() {
		return hunger;
	}

	public int getTiredness() {
		return tiredness;
	}
	
	public String getName() {
		return name;
	}
	
	protected void keepStatsInRange() {
		if (hunger < 0) {
			hunger = 0;
		} else if (hunger > MAX_STAT) {
			hunger = MAX_STAT;
		}

		if (tiredness < 0) {
			tiredness = 0;
		} else if (tiredness > MAX_STAT) {
			tiredness = MAX_STAT;
		}
	}

	public abstract void feed();

	public abstract void play();

	public abstract void sleep();
}
