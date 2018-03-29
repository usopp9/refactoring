package refactoring.chap12;

public class ValueChangeEvent {
	private final Value source;

	public ValueChangeEvent(Value source) {
		this.source = source;
	}

	public Value getSource() {
		return source;
	}
	
	
}
