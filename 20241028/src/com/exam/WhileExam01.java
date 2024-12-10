package com.exam;

import java.io.*;

public class WhileExam01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("정수 입력 : ");
		bw.flush();
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		
		while(cnt < n) {
			//bw.write("Warning");
			//bw.flush();
			
			System.out.print("Warning");
			
			cnt++;
		}
		
		bw.close();
		br.close();
	}

}
