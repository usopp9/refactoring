package refactoring.chap11;

public class ShapeOval extends Shape {
	private static final ShapeOval instance = new ShapeOval();

	public static ShapeOval getInstance(int startX, int startY, int endX, int endY) {
		instance.setShape(startX, startY, endX, endY);
		return instance;
	}
	
	private ShapeOval() {}

	@Override
	public String getName() {
		return "OVAL";
	}
	@Override
	public void draw() {
		System.out.printf("%15s : %s%n","drawOval",this);
	}
}
