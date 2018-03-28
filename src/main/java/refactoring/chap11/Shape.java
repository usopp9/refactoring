package refactoring.chap11;

public class Shape {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	
	private final int typecode;
	private final int startX;
	private final int startY;
	private final int endX;
	private final int endY;
	public Shape(int typecode, int startX, int startY, int endX, int endY) {
		super();
		this.typecode = typecode;
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}
	public int getTypecode() {
		return typecode;
	}
	
	public String getName() {
		switch(typecode) {
		case TYPECODE_LINE:
			return "LINE";
		case TYPECODE_RECTANGLE:
			return "RECTANGLE";
		case TYPECODE_OVAL:
			return "OVAL";
		default:
			return null;	
		}
	}
	@Override
	public String toString() {
		return String.format("[%10s, (%3s , %3s) - (%3s , %3s)]", getName(), startX, startY,
				endX, endY);
	}
	public void draw() {
		switch(typecode) {
		case TYPECODE_LINE:
			drawLine();
			break;
		case TYPECODE_RECTANGLE:
			drawRectangle();
			break;
		case TYPECODE_OVAL:
			drawOval();
			break;
		default:
			;
		}
	}
	private void drawOval() {
		System.out.printf("%15s : %s%n","drawOval",this);		
	}
	private void drawRectangle() {
		System.out.printf("%15s : %s%n","drawRectangle",this);		
	}
	private void drawLine() {
		System.out.printf("%15s : %s%n","drawLine",this);		
	}
	
}
