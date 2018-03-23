package refactoring.chap08;

public class ShapeOval extends Shape {
	public static ShapeOval createShapeOval(int startx, int starty, int endx, int endy) {
		return new ShapeOval(startx, starty, endx, endy);
	}
	private ShapeOval(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}
	@Override
	public int getTypecode() {
		return Shape.TYPECODE_OVAL;
	}
	@Override
	public String getName() {
			return "Oval";
	}
	@Override
	public void draw() {
		System.out.printf("%15s : %s%n", "drawOval: ", this.toString());
	}
}
