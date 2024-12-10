package com.exam;

import java.io.*;

public class ForExam05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("정수 입력 : ");
        bw.flush();
        int n = Integer.parseInt(br.readLine());

        int fac = 1;

        for(int i = 1; i <= n; i++) {
        	fac *= i;
        }
        
        bw.write("N 팩토리얼 : " + fac);
        bw.flush();
        
        bw.close();
        br.close();
	}

}
