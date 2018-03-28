package refactoring.chap11;

public class ShapeLine extends Shape {
	private static final ShapeLine instance = new ShapeLine();

	public static ShapeLine getInstance(int startX, int startY, int endX, int endY) {
		instance.setShape(startX, startY, endX, endY);
		return instance;
	}
	
	private ShapeLine() {}

	@Override
	public String getName() {
		return "LINE";
	}
	@Override
	public void draw() {
		System.out.printf("%15s : %s%n","drawLine",this);	
	}
}
