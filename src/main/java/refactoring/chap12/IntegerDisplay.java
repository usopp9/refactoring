package refactoring.chap12;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class IntegerDisplay extends JFrame implements ActionListener{

	private JPanel contentPane;
	private Value value;
	private JLabel lblOctal;
	private JLabel lblDecimal;
	private JLabel lblHexadecimal;
	private JButton btnIncrement;
	private JButton btnDecrement;
	
	public IntegerDisplay() {
		initComponent();
		value = new Value(0);
	}

	private void initComponent() {
		setTitle("IntegerDisplay");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 289);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lbl8Title = new JLabel("8진수");
		lbl8Title.setFont(new Font("굴림", Font.BOLD, 20));
		lbl8Title.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl8Title);
		
		lblOctal = new JLabel("0");
		lblOctal.setFont(new Font("굴림", Font.BOLD, 20));
		lblOctal.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblOctal);
		
		JLabel lbl10Title = new JLabel("10진수");
		lbl10Title.setFont(new Font("굴림", Font.BOLD, 20));
		lbl10Title.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl10Title);
		
		lblDecimal = new JLabel("0");
		lblDecimal.setFont(new Font("굴림", Font.BOLD, 20));
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDecimal);
		
		JLabel lbl16Title = new JLabel("16진수");
		lbl16Title.setFont(new Font("굴림", Font.BOLD, 20));
		lbl16Title.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl16Title);
		
		lblHexadecimal = new JLabel("0");
		lblHexadecimal.setFont(new Font("굴림", Font.BOLD, 20));
		lblHexadecimal.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblHexadecimal);
		
		btnIncrement = new JButton("+");
		btnIncrement.addActionListener(this);
		btnIncrement.setFont(new Font("굴림", Font.BOLD, 30));
		contentPane.add(btnIncrement);
		
		btnDecrement = new JButton("-");
		btnDecrement.addActionListener(this);
		btnDecrement.setFont(new Font("굴림", Font.BOLD, 30));
		contentPane.add(btnDecrement);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnIncrement) {
			setValue(value.getValue()+1);
		}
		if(e.getSource()==btnDecrement) {
			setValue(value.getValue()-1);
		}
	}

	public int getValue() {
		return value.getValue();
	}

	public void setValue(int value) {
		this.value.setValue(value);
		lblOctal.setText(Integer.toOctalString(value));
		lblDecimal.setText(Integer.toString(value));
		lblHexadecimal.setText(Integer.toHexString(value));
		
	}
	
}
