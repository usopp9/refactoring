package refactoring.chap12;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

public class CircleGraph extends Graph {
	private static final CircleGraph instance = new CircleGraph();

	public static CircleGraph getInstance(int width, int height) {
		instance.setPreferredSize(new Dimension(width, height));
		return instance;
	}

	public CircleGraph() {
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(graphValue > 0 ? Color.BLUE : Color.RED);
		Rectangle bounds = getBounds();
		int startAngle = 90;
		int endAngle = -(int) (graphValue * 10.0);
		g.fillArc(0, 0, bounds.width, bounds.height, startAngle, endAngle);
	}
}