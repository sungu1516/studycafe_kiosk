package com.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing_inheritance extends JFrame {

	JFrame j;

	Swing_inheritance() {
		JButton b = new JButton("click");
		b.setBounds(130, 100, 100, 40);

		add(b); // adding the button on frame
		setSize(400, 500);
		setLayout(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		Swing_inheritance sw = new Swing_inheritance();

	}

}