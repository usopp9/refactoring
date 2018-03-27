package refactoring.chap10;

public class InvalidCommandException extends Exception {

	public InvalidCommandException() {
	}

	public InvalidCommandException(String name) {
		super(name);
	}
	
}
