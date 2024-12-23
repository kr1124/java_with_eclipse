package com.exam;

import java.io.*;

public class DoWhileExam03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("정수 입력 : ");
		bw.flush();
		int n = Integer.parseInt(br.readLine());
		int total = 1;
		
		int cnt = 1;
		
		do {
			total *= cnt++;
		} while(cnt <= n);
		
		bw.write("팩토리얼 : " + total);
		
		bw.close();
		br.close();
	}

}
