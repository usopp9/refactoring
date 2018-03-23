package refactoring.chap08;

public class ShapeLine extends Shape {
	
	public static ShapeLine createShapeLine(int startx, int starty, int endx, int endy) {
		return new ShapeLine(startx, starty, endx, endy);
	}
	private ShapeLine(int startx, int starty, int endx, int endy) {
		super(startx, starty, endx, endy);
	}
	@Override
	public int getTypecode() {
		return Shape.TYPECODE_LINE;
	}
	@Override
	public String getName() {
			return "LINE";
	}
	@Override
	public void draw() {	
			System.out.printf("%15s : %s%n", "drawLine: ", this.toString());
	}	
}
