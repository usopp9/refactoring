package refactoring.chap11;

public abstract class Shape {

	private final int startX;
	private final int startY;
	private final int endX;
	private final int endY;
	
	
	//factory method
	public static Shape createLine(int startX, int startY, int endX, int endY) {
		return new ShapeLine( startX, startY, endX, endY);
	}
	public static Shape createRectangle(int startX, int startY, int endX, int endY) {
		return new ShapeRectangle( startX, startY, endX, endY);
	}
	public static Shape createOval(int startX, int startY, int endX, int endY) {
		return new ShapeOval( startX, startY, endX, endY);
	}
	protected Shape(int startX, int startY, int endX, int endY) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}

	public abstract String getName();
	@Override
	public String toString() {
		return String.format("[%10s, (%3s , %3s) - (%3s , %3s)]", getName(), startX, startY,
				endX, endY);
	}
	public abstract void draw();	
}
