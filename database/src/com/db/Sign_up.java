package com.db;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Sign_up {

	String path = "A:\\Swing\\database\\User_info\\user_info.txt";
	// File file = new File(path);

	public Sign_up(String id, int pw, String name, String addr) {

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
			bw.write(id + ";");
			bw.write(pw + ";");
			bw.write(name + ";");
			bw.write(addr + "\n");
			bw.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
