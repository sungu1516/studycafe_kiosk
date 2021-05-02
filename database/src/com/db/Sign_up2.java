package com.db;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Sign_up2 {
	String path_id = "A:\\Swing\\database\\User_info\\user_id.txt";
	String path_pw = "A:\\Swing\\database\\User_info\\user_pw.txt";
	String path_info = "A:\\Swing\\database\\User_info\\user_info2.txt";

	public Sign_up2(String id, int pw, String name, String addr) {
		try {
			BufferedWriter bw1 = new BufferedWriter(new FileWriter(path_id, true));
			bw1.write(getIndex(path_id) + id + "\n");
			BufferedWriter bw2 = new BufferedWriter(new FileWriter(path_pw, true));
			bw2.write(getIndex(path_pw) + pw + "\n");
			BufferedWriter bw3 = new BufferedWriter(new FileWriter(path_info, true));
			bw3.write(getIndex(path_pw) + name + ";");
			bw3.write(addr + "\n");

			bw1.close();
			bw2.close();
			bw3.close();

		} catch (

		Exception e) {
			// TODO: handle exception
		}

	}

	public String getIndex(String path) {
		int count = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader(path));

			while (br.readLine() != null) {
				count++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return count + "";
	}
}