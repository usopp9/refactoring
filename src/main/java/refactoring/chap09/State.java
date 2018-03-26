package refactoring.chap09;

public abstract class State {
	public abstract void start(Logger logger);
	public abstract void stop(Logger logger);
	public abstract void log(String info);
	
	
/*	public abstract int getTypeCode();*/
	
}
