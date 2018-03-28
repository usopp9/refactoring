package refactoring.chap11;

public class ShapeRectangle extends Shape {
	private static final ShapeRectangle instance = new ShapeRectangle();

	public static ShapeRectangle getInstance(int startX, int startY, int endX, int endY) {
		instance.setShape(startX, startY, endX, endY);
		return instance;
	}
	
	private ShapeRectangle() {}

	@Override
	public String getName() {
		return "RECTANGLE";
	}
	@Override
	public void draw() {
		System.out.printf("%15s : %s%n","drawRectangle",this);	
	}
}
