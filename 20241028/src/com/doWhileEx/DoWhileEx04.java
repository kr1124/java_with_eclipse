package com.doWhileEx;

import java.io.*;

public class DoWhileEx04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total = 0;
		int cnt = 0;
		double avg = 0.0;
		
		do {
			bw.write("점수 입력 : ");
			bw.flush();
			int a = Integer.parseInt(br.readLine());
			if(a < 0 || a > 100) {
				bw.write("범위 초과\n");
				bw.flush();
				continue;
			}
			total += a;
			cnt++;
		} while(cnt < 3);
		
		avg = total / 3.0;
		
		bw.write("총점 : " + total + ", 평균 : " + avg);
		
		bw.close();
		br.close();
	}

}
