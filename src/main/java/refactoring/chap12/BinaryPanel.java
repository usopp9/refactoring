package refactoring.chap12;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;

public class BinaryPanel extends JPanel implements ValueListener{

	private static final BinaryPanel instance = new BinaryPanel();
	private JLabel lblBinary;
	
	
	public static BinaryPanel getInstance(int width ,int height) {
		instance.setPreferredSize(new Dimension(width, height));
		return instance;
	}
	private BinaryPanel() {
		setLayout(new BorderLayout(0, 0));	
		lblBinary = new JLabel();
		lblBinary.setForeground(Color.blue);
		lblBinary.setFont(new Font("굴림", Font.BOLD, 20));
		add(lblBinary);
	}
	
	@Override
	public void valueChanger(ValueChangeEvent e) {
		Value value = e.getSource();
		if(value.getValue() <0) {
			lblBinary.setForeground(Color.red);
		}else {
			lblBinary.setForeground(Color.blue);
		}
		lblBinary.setText(Integer.toBinaryString(value.getValue()));
		revalidate();
		
	}

}
