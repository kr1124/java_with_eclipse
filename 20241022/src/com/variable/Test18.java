package com.variable;

import java.io.*;

public class Test18 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int kor = 0;
		int eng = 0;
		int mat = 0;
		int sum = 0;

		bw.write("���� ������ ? : ");
		bw.flush();
		kor = Integer.parseInt(br.readLine());
		bw.write("���� ������ ? : ");
		bw.flush();
		eng = Integer.parseInt(br.readLine());
		bw.write("���� ������ ? : ");
		bw.flush();
		mat = Integer.parseInt(br.readLine());

		sum = kor + eng + mat;
		
		bw.write("������ " + sum + "���Դϴ�.");
		bw.flush();
		bw.close();
		br.close();
	}

}
