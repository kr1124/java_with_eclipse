package com.exam;

import java.io.*;

public class ForExam03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int k = 1;

		while(k == 1) {
			bw.write("정수 입력 : ");
	        bw.flush();
	        int n1 = Integer.parseInt(br.readLine());
	        
			bw.write("정수 입력 : ");
	        bw.flush();
	        int n2 = Integer.parseInt(br.readLine());
	     
	        bw.write("합은 " + (n1 + n2) + "\n");
	        bw.flush();
		}
		
        bw.close();
        br.close();
	}

}
