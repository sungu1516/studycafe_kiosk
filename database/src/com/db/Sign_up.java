package com.db;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Sign_up {

	String path_id = "A:\\Swing\\database\\User_info\\user_id.txt";
	String path_idpw = "A:\\Swing\\database\\User_info\\user_idpw.txt";
	String path_id_info = "A:\\Swing\\database\\User_info\\user_info.txt";
	
	HashMap<String, ArrayList<String>> user_map = new HashMap<String, ArrayList<String>>();
	
	public Sign_up() {
		// TODO Auto-generated constructor stub
	}

	public Sign_up(String id, int pw) {

		try {
			saveToMap(id, pw);
			
			BufferedWriter bw1 = new BufferedWriter(new FileWriter(path_id, true));
			bw1.write(id + "\n");
			BufferedWriter bw2 = new BufferedWriter(new FileWriter(path_idpw, true));
			bw2.write(id + ";");
			bw2.write(pw + "\n");
			
			bw1.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void saveToMap(String id, int pw) {
		ArrayList<String> user_list = new ArrayList<String>();
		user_list.add(pw+"");
		
		user_map.put(id, user_list);
		
	}
}
