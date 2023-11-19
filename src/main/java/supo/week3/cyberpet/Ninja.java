package supo.week3.cyberpet;

public class Ninja extends Pet {
	public Ninja(String name) {
		super(name);
	}
	
	@Override
	public boolean isDead() {
		// Ninja is equipped to survive harsh conditions, so it won't die
		return false;
	}

	@Override
	public void feed() {
		hunger -= 4;

		keepStatsInRange();
	}

	@Override
	public void play() {
		hunger += 2;
		tiredness += 10;

		keepStatsInRange();
	}

	@Override
	public void sleep() {
		tiredness = 0;

		keepStatsInRange();
	}
}
