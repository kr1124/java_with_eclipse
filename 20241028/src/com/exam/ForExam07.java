package com.exam;

import java.io.*;

public class ForExam07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("´Ü ÀÔ·Â : ");
        bw.flush();
        int n = Integer.parseInt(br.readLine());

        if (n < 1 || n > 9) {
        	System.exit(0);
        }

        for(int i = 1; i <= 9; i++) {
        	bw.write(n + " * " + i + " = " + n * i + "\n");
        }

        bw.flush();
        
        bw.close();
        br.close();
	}

}
