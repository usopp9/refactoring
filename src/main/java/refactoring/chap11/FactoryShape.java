package refactoring.chap11;

public class FactoryShape {
	public enum ShapeType{
		LINE, RECTANGLE, OVAL
	}
	public static Shape createShape(ShapeType type,int startX, int startY, int endX, int endY) {
		switch(type) {
		case LINE:
			return ShapeLine.getInstance(startX, startY, endX, endY);
		case RECTANGLE:
			return ShapeRectangle.getInstance(startX, startY, endX, endY);
		case OVAL:
			return ShapeOval.getInstance(startX, startY, endX, endY);
		default:
			return null;
		}
	}
}
