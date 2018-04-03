package refactoring.chap13;

import java.util.Random;

public class Dice{
	private final Random random;
	public Dice() {
		this(314159L);
	}
	public Dice(Long seed) {
		random = new Random(seed);
	}
	
	
	public Random getRandom() {
		return random;
	}
	
	public int nextInt() {
		return random.nextInt(6)+1;
	}
	
	public void setSeed(Long seed) {
		random.setSeed(seed);
	}
}
