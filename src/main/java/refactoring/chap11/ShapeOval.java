package refactoring.chap11;

public class ShapeOval extends Shape {

	public ShapeOval(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public String getName() {
		return "OVAL";
	}
	@Override
	public void draw() {
		System.out.printf("%15s : %s%n","drawOval",this);
	}
}
