package com.variable;

import java.io.*;

public class Test17 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name = "";
		String age = "";
		String address = "";
		String tel = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//bw.write("�̸� �Է� : ");
		//bw.flush();
		//System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("���� �Է� : ");
		age = br.readLine();

		System.out.print("�ּ� �Է� : ");
		address = br.readLine();
		
		System.out.print("�޴��� ��ȣ �Է� : ");
		tel = br.readLine();

		bw.write(name);
		bw.write("\n");
		bw.write(age);
		bw.write("\n");
		bw.write(address);
		bw.write("\n");
		bw.write(tel);
		bw.write("\n");
		
		bw.flush();
		bw.close();
		
		br.close();
		
		
	}

}
