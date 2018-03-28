package refactoring.chap11;

public class ShapeRectangle extends Shape {

	public ShapeRectangle(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public String getName() {
		return "RECTANGLE";
	}
	@Override
	public void draw() {
		System.out.printf("%15s : %s%n","drawRectangle",this);	
	}
}
