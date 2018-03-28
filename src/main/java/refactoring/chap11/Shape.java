package refactoring.chap11;

public abstract class Shape {

	private int startX;
	private int startY;
	private int endX;
	private int endY;
	
	protected Shape() {}
	
	public void setShape(int startX, int startY, int endX, int endY) {
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
