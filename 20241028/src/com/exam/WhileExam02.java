package com.exam;

import java.io.*;

public class WhileExam02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("정수 입력 : ");
		bw.flush();
		int n = Integer.parseInt(br.readLine());
		int cnt = 1;
		
		
		while(cnt <= n) {
			bw.write(cnt++ * 4 + " ");
			bw.flush();
		}
		
		bw.close();
		br.close();
	}

}
