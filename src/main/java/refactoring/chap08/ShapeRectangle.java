package refactoring.chap08;

public class ShapeRectangle extends Shape {

	public ShapeRectangle(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}

	@Override
	public int getTypecode() {
		return Shape.TYPECODE_RECTANGLE;
	}

	@Override
	public String getName() {
		return "Rectangle";
	}

	@Override
	public void draw() {
		System.out.printf("%15s : %s%n", "drawRectangle: ", this.toString());
	}
}
