package com.swing;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;

public class Swing_basic {

	public static void main(String[] args) {
		JFrame frame = new JFrame(); // creating instance of Jframe

		JButton button = new JButton("test_click"); // creating instance of JButton

		button.setBounds(50, 50, 80, 30);

		frame.add(button);

		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JMenu menu = new JMenu();
	}

}