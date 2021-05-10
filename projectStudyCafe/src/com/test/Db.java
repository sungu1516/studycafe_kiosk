package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Db {
	static String path_id = "A:\\kiosk\\projectStudyCafe\\User_info\\user_id.txt";
	static String path_pw = "A:\\kiosk\\projectStudyCafe\\User_info\\user_pw.txt";
	static String path_op = "A:\\kiosk\\projectStudyCafe\\User_info\\user_op.txt";

	static ArrayList<String> id_list = new ArrayList<String>();
	static ArrayList<String> pw_list = new ArrayList<String>();
	static ArrayList<String> op_list = new ArrayList<String>();
	// static ArrayList<upload> listPerson= new ArrayList<upload>();

	// data를 리스트 안에 인스턴스 형태로 저장하는 경우
	public static void bringDb_byinstance(ArrayList<upload> listperson) {

		try {
			BufferedReader br_id = new BufferedReader(new FileReader(path_id));
			BufferedReader br_pw = new BufferedReader(new FileReader(path_pw));

			String data_id = "";
			String data_pw = "";

			while ((data_id = br_id.readLine()) != null && ((data_pw = br_pw.readLine()) != null)) {

				id_list.add(data_id);
				pw_list.add(data_pw);
			}

			br_id.close();
			br_pw.close();

			// listPerson 이라는 리스트 안에 user별 정보를 인스턴스 형태로 넣어두기
			for (int i = 0; i < id_list.size(); i++) {
				listperson.add(new upload(id_list.get(i), pw_list.get(i)));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	// data를 리스트 안에 리스트 형태로 저장하는 경우
	public static void bringDb_bylist(ArrayList<ArrayList<String>> listperson) {

		try {
			BufferedReader br_id = new BufferedReader(new FileReader(path_id));
			BufferedReader br_pw = new BufferedReader(new FileReader(path_pw));
			BufferedReader br_op = new BufferedReader(new FileReader(path_op));
			
			String data_id = "";
			String data_pw = "";
			String data_op = "";

			while ((data_id = br_id.readLine()) != null && ((data_pw = br_pw.readLine()) != null)
					&& ((data_op = br_op.readLine()) != null)) {

				id_list.add(data_id);
				pw_list.add(data_pw);
				op_list.add(data_op);
			}

			br_id.close();
			br_pw.close();
			br_op.close();

			// listPerson 이라는 리스트 안에 user별 정보를 인스턴스 형태로 넣어두기
			for (int i = 0; i < 2; i++) {
				listperson.add(id_list);
				listperson.add(pw_list);
				listperson.add(op_list);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void putinDb(String id, String pw) {
		try {
			BufferedWriter bw1 = new BufferedWriter(new FileWriter(path_id, true));
			BufferedWriter bw2 = new BufferedWriter(new FileWriter(path_pw, true));
			BufferedWriter br_op = new BufferedWriter(new FileWriter(path_op, true));

			bw1.write(id+"\n");
			bw2.write(pw+"\n");
			br_op.write(""+"\n");
			
			bw1.close();
			bw2.close();
			br_op.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void main(String[] args) {

	}
}
