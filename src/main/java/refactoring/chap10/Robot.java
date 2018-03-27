package refactoring.chap10;

import java.util.StringTokenizer;

public class Robot {
	private final String name;
	private final Position position = new Position(0, 0);
	private final Direction direction = new Direction(0, 1);

	public Robot(String name) {
		this.name = name;
	}

	public void execute(String commandSequence) {
		StringTokenizer tokenizer = new StringTokenizer(commandSequence);
		try {
			while (tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				executeCommand(token);
			}
		} catch (InvalidCommandException e) {
			System.out.println("Invalid command : "+ e.getMessage());
		}
	}

	private void executeCommand(String commandString) throws InvalidCommandException {
		Command command = Command.parseCommand(commandString);
		executeCommand(command);
	}

	private void executeCommand(Command command){
		if (command == Command.FORWARD) {
			position.relativeMove(direction.getX(), direction.getY());
		} else if (command == Command.BACKWARD) {
			position.relativeMove(-direction.getX(), -direction.getY());
		} else if (command == Command.TURN_RIGHT) {
			direction.setDirection(direction.getY(), -direction.getX());
		} else if (command == Command.TURN_LEFT) {
			direction.setDirection(-direction.getY(), direction.getX());
		}
	}

	@Override
	public String toString() {
		return String.format("Robot [%s, %s, %s]", name, position, direction);
	}

}
