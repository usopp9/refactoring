package refactoring.chap13;

import java.util.Random;

public class Dice extends Random {
	public Dice() {
		super(314159L);
	}
	public Dice(Long seed) {
		super(seed);
	}
	@Override
	public int nextInt() {
		return nextInt(6)+1;
	}
	@Override
	public void nextBytes(byte[] arg0) {
		throw new UnsupportedOperationException();
	}
	@Override
	public double nextDouble() {
		throw new UnsupportedOperationException();
	}
	@Override
	public float nextFloat() {
		throw new UnsupportedOperationException();
	}
	@Override
	public synchronized double nextGaussian() {
		throw new UnsupportedOperationException();
	}	
	@Override
	public long nextLong() {
		throw new UnsupportedOperationException();
	}
	
}
