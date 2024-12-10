package com.exam;

import java.io.*;

public class WhileExam04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("입력할 정수의 개수 : ");
		bw.flush();
		
		int n = Integer.parseInt(br.readLine());
		int total = 0;
		int cnt = 0;
		
		while(cnt < n) {
			bw.write("정수 입력 : ");
			bw.flush();

			total += Integer.parseInt(br.readLine());
			cnt++;
		}
		
		double avg = total / (double)n;
		
		bw.write("평균 : " + avg);
		
		bw.close();
		br.close();
	}

}
