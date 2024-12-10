package com.exam;

import java.io.*;

public class ForExam01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        bw.write("정수 입력 : ");
        bw.flush();
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
			sum += i;
		}
        
        bw.write("0부터 " + n + "까지의 합계:" + sum);
        bw.flush();

        bw.close();
        br.close();
	}

}
