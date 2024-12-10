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

		//bw.write("이름 입력 : ");
		//bw.flush();
		//System.out.print("이름 입력 : ");
		name = br.readLine();

		System.out.print("나이 입력 : ");
		age = br.readLine();

		System.out.print("주소 입력 : ");
		address = br.readLine();
		
		System.out.print("휴대폰 번호 입력 : ");
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
