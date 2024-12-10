package com.exam;

import java.io.*;

public class ForExam04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("정수 입력 : ");
        bw.flush();
        int a = Integer.parseInt(br.readLine());
		bw.write("정수 입력 : ");
        bw.flush();
        int b = Integer.parseInt(br.readLine());
        
        int sum = 0;
        
        if(a > b) {
        	a ^= b;
        	b ^= a;
        	a ^= b;
        }

        for(int i = a; i <= b; i++) {
        	sum += i;
        }
        
        bw.write("사이의 합 : " + sum);
        bw.flush();
        
        bw.close();
        br.close();
	}

}
