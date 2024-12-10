package com.exam;

import java.io.*;

public class ForExam09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("입력할 정수 개수 : ");
        bw.flush();
        int n = Integer.parseInt(br.readLine());

        int sum = 0; 
        for(int i = 0; i < n; i++) {
    		bw.write("정수 입력 : ");
            bw.flush();
            sum += Integer.parseInt(br.readLine());
        }
        
        bw.write("입력된 정수의 평균 : " + (sum / (double)n));
        
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
	}

}
