package com.exam;

import java.io.*;

public class DoWhileExam02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 0;
		int total = 0;
		
		do {
			total += n;
			n += 2;
		} while(n <= 100);
		
		bw.write(total + "");
		
		bw.close();
		br.close();
	}

}
