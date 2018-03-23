package refactoring.chap08;

public class ShapeLine extends Shape {

	public ShapeLine(int startx, int starty, int endx, int endy) {
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
