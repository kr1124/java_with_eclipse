package com.variable;

import java.io.*;

public class Test10 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int g1 = 0;
		int g2 = 0;
		int g3 = 0;
		int g4 = 0;
		int g5 = 0;
		
		System.out.println("���� ���� : ");
		g1 = Integer.parseInt(br.readLine());
		System.out.println("���� ���� : ");
		g2 = Integer.parseInt(br.readLine());
		System.out.println("���� ���� : ");
		g3 = Integer.parseInt(br.readLine());
		System.out.println("��ȸ ���� : ");
		g4 = Integer.parseInt(br.readLine());
		System.out.println("���� ���� : ");
		g5 = Integer.parseInt(br.readLine());

		br.close();
		
		int gall = g1 + g2 + g3 + g4 + g5;
		
		bw.write("������ " + gall + "��, ����� " + gall / 5 + "�� �Դϴ�.");
		
		bw.flush();
		bw.close();
	}

}
