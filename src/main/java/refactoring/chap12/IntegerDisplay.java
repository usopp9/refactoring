package refactoring.chap12;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import refactoring.chap12.Graph.GraphType;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class IntegerDisplay extends JFrame implements ActionListener, ValueListener {

	private JPanel contentPane;
	private Value value;
	private JLabel lblOctal;
	private JLabel lblDecimal;
	private JLabel lblHexadecimal;
	private JButton btnIncrement;
	private JButton btnDecrement;
	private JPanel northPanel;
	private Graph circleGraph;
	private Graph recGraph;
	private BinaryPanel panel;

	public IntegerDisplay() {
		initComponent();
		value = new Value(0);
		value.addValueListener(this);
		value.addValueListener(circleGraph);
		value.addValueListener(recGraph);
		value.addValueListener(panel);
	}

	private void initComponent() {
		setTitle("IntegerDisplay");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = BinaryPanel.getInstance(100, 100);
		contentPane.add(panel, BorderLayout.WEST);

		northPanel = new JPanel();
		contentPane.add(northPanel, BorderLayout.NORTH);
		northPanel.setLayout(new GridLayout(0, 2, 10, 5));

		JLabel lbl8Title = new JLabel("8진수");
		lbl8Title.setOpaque(true);
		lbl8Title.setBackground(Color.PINK);
		northPanel.add(lbl8Title);
		lbl8Title.setFont(new Font("굴림", Font.BOLD, 20));
		lbl8Title.setHorizontalAlignment(SwingConstants.CENTER);

		lblOctal = new JLabel("0");
		northPanel.add(lblOctal);
		lblOctal.setFont(new Font("굴림", Font.BOLD, 20));
		lblOctal.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl10Title = new JLabel("10진수");
		lbl10Title.setBackground(Color.PINK);
		lbl10Title.setOpaque(true);
		northPanel.add(lbl10Title);
		lbl10Title.setFont(new Font("굴림", Font.BOLD, 20));
		lbl10Title.setHorizontalAlignment(SwingConstants.CENTER);

		lblDecimal = new JLabel("0");
		northPanel.add(lblDecimal);
		lblDecimal.setFont(new Font("굴림", Font.BOLD, 20));
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lbl16Title = new JLabel("16진수");
		lbl16Title.setOpaque(true);
		lbl16Title.setBackground(Color.PINK);
		northPanel.add(lbl16Title);
		lbl16Title.setFont(new Font("굴림", Font.BOLD, 20));
		lbl16Title.setHorizontalAlignment(SwingConstants.CENTER);

		lblHexadecimal = new JLabel("0");
		northPanel.add(lblHexadecimal);
		lblHexadecimal.setFont(new Font("굴림", Font.BOLD, 20));
		lblHexadecimal.setHorizontalAlignment(SwingConstants.CENTER);

		btnIncrement = new JButton("+");
		northPanel.add(btnIncrement);
		btnIncrement.addActionListener(this);
		btnIncrement.setFont(new Font("굴림", Font.BOLD, 30));

		btnDecrement = new JButton("-");
		northPanel.add(btnDecrement);
		btnDecrement.addActionListener(this);
		btnDecrement.setFont(new Font("굴림", Font.BOLD, 30));

		circleGraph = Graph.createGraph(GraphType.CIRCLE, 100, 100);
		contentPane.add(circleGraph, BorderLayout.CENTER);

		recGraph = Graph.createGraph(GraphType.RECTANGLE, 100,50);
		contentPane.add(recGraph, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIncrement) {
			setValue(value.getValue() + 1);
		}
		if (e.getSource() == btnDecrement) {
			setValue(value.getValue() - 1);
		}
	}

	public int getValue() {
		return value.getValue();
	}

	public void setValue(int value) {
		this.value.setValue(value);

	}

	@Override
	public void valueChanger(ValueChangeEvent e) {
		if (e.getSource() == value) {
			Value v = e.getSource();
			lblOctal.setText(Integer.toOctalString(v.getValue()));
			lblDecimal.setText(Integer.toString(v.getValue()));
			lblHexadecimal.setText(Integer.toHexString(v.getValue()));
		}
	}

}
