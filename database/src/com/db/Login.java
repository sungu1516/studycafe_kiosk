package com.db;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Login extends Sign_up {

	String path_id = "A:\\Swing\\database\\User_info\\user_id.txt";
	String path_pw = "A:\\Swing\\database\\User_info\\user_pw.txt";
	String path_option = "A:\\Swing\\database\\User_info\\user_option.txt";
	String user_option = "";

	public Login(String id, int pw) {
		try {
			BufferedReader br_pw = new BufferedReader(new FileReader(path_pw));
			BufferedReader br_option = new BufferedReader(new FileReader(path_option));

			while (true) {
				String line = br_pw.readLine();
				String line2 = br_option.readLine();

				if (line == null) {
					System.out.println("로그인 실패");
					break;
				}

				if (line.equals(id + ";" + pw)) {
					System.out.println("로그인 성공");
					user_option += line2;
					break;
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void selectOp(String option, String qu) {
		try {
			BufferedReader br_option = new BufferedReader(new FileReader(path_id_info));

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

//	public void getInfo() {
//		
//	}

}
