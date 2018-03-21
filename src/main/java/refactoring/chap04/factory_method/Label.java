package refactoring.chap04.factory_method;

public class Label {
	private final String label;

	public Label(String label) {
		this.label = label;
	}
	
	//factory method
	public static Label newNull() {
		return NullLabel.getInstance();
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
	
	//싱글패턴
	private static class NullLabel extends Label {
		private static final NullLabel instance = new NullLabel();
				
		public static NullLabel getInstance() {
			return instance;
		}
		private NullLabel() {
			super("(none)");
		}
		@Override
		public void display() {}
		
		@Override
		public boolean isNull() {
			return true;
		}
	}

}
