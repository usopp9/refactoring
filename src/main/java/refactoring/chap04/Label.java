package refactoring.chap04;

public class Label {
	private final String label;

	public Label(String label) {
		this.label = label;
	}
	public void display() {
		System.out.println("display: "+ label);
	}
	public boolean isNull() {
		return false;
	}
	@Override
	public String toString() {
		return String.format("\"%s\"", label);
	}
	public String getLabel() {
		return label;
	}
	
}
