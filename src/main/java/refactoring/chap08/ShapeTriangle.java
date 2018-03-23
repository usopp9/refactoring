package refactoring.chap08;

public class ShapeTriangle extends Shape {
	public static ShapeTriangle createShapeTriangle(int startx, int starty, int endx, int endy) {
		return new ShapeTriangle(startx, starty, endx, endy);
	}
	private ShapeTriangle(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}

	@Override
	public int getTypecode() {
		return Shape.TYPECODE_TRIANGLE;
	}

	@Override
	public String getName() {
		return "Triangle";
	}

	@Override
	public void draw() {
		System.out.printf("%15s : %s%n", "drawTriangle: ", this.toString());
	}

}
