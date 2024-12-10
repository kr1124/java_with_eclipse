package com.exam;

import java.io.*;

public class ForExam06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("정수 입력 : ");
        bw.flush();
        int n = Integer.parseInt(br.readLine());

        int sum_odds = 0;
        int sum_ends = 0;
        int sum_total = 0;

        for(int i = 1; i <= n; i++) {
        	if(i % 2 == 0) {
        		sum_ends += i;
        	}
        	else {
        		sum_odds += i;
        	}
        	sum_total += i;
        	
        	if(i % 10 == 0) {
        		bw.write("1 ~ " + i + "까지의 홀수 합 : " + sum_odds + "\n");
        		bw.write("1 ~ " + i + "까지의 짝수 합 : " + sum_ends + "\n");
        		bw.write("1 ~ " + i + "까지의 전체 합 : " + sum_total + "\n");
        	}
        }

        bw.write("홀수 합 : " + sum_odds + "\n");
        bw.write("짝수 합 : " + sum_ends + "\n");
        bw.write("전체 합 : " + sum_total);
        bw.flush();
        
        bw.close();
        br.close();
	}

}
