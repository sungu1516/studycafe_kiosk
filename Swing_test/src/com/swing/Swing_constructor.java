package com.swing;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing_constructor {
	JFrame j; // j��ü�� ���� �ּҰ��� �Ҵ���� ���� �����̴�.

	public Swing_constructor() {
		j = new JFrame(); // creating instance of JFrame

		JButton b = new JButton("click");
		b.setBounds(50, 50, 100, 100);

		j.add(b);

		j.setSize(250, 250);
		j.setLayout(null);
		j.setVisible(true);

	}

	public static void main(String[] args) {
		Swing_constructor s = new Swing_constructor();
	}

}
