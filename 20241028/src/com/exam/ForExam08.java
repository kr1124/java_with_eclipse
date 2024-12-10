package com.exam;

import java.io.*;

public class ForExam08 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("정수 입력 : ");
        bw.flush();
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
        	bw.write(3 * i + " ");
        }
        
        
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
	}

}
