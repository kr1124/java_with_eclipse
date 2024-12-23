package com.exam;

import java.io.*;

public class WhileExam03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 0;
		int total = 0;
		
		while(n != 0 || total == 0) {
			bw.write("정수 입력 : ");
			bw.flush();
			n = Integer.parseInt(br.readLine());
			total += n;
		}
		
//		do {
//			bw.write("정수 입력 : ");
//			bw.flush();
//			n = Integer.parseInt(br.readLine());
//			total += n;
//		} while(n != 0);
		
		bw.write(total + "");
		
		bw.close();
		br.close();
	}

}
