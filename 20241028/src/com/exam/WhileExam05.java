package com.exam;

import java.io.*;

public class WhileExam05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("승수 : ");
		bw.flush();
		
		int n = Integer.parseInt(br.readLine());
		int total = 1;
		int cnt = 0;
		
		if(n > 31) {
			bw.write("수가 너무 큽니다.");
			bw.flush();
		}
		else if(n < 0) {
			bw.write("음수는 지원하지 않습니다.");
			bw.flush();
		}
		else {
			while(cnt < n) {
				total *= 2;
				cnt++;
			}
			bw.write("" + total);
			bw.flush();
		}
		
		bw.close();
		br.close();
	}

}
