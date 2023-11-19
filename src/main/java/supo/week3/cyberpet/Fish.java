package supo.week3.cyberpet;

public class Fish extends Pet {

	public Fish(String name) {
		super(name);
	}

	@Override
	public void feed() {
		hunger -= 20;

		keepStatsInRange();
	}

	@Override
	public void play() {
		hunger += 10;
		tiredness += 20;

		keepStatsInRange();
	}

	@Override
	public void sleep() {
		tiredness -= 50;

		keepStatsInRange();
	}

}
