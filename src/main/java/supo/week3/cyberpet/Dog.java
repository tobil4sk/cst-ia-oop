package supo.week3.cyberpet;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void feed() {
		hunger -= 10;

		keepStatsInRange();
	}

	@Override
	public void play() {
		hunger += 5;
		tiredness += 10;

		keepStatsInRange();
	}

	@Override
	public void sleep() {
		// sleeping makes the dog a bit hungry
		hunger += 5;
		tiredness -= 50;

		keepStatsInRange();
	}

}
