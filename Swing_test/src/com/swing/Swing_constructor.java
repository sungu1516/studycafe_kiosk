package com.swing;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing_constructor {
	JFrame j; // j객체는 아직 주소값을 할당받지 못한 상태이다.

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
