package com.exam;

import java.io.*;

public class WhileExam07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = -50;
		
		while(n <= 1) {
			bw.write(n + "\t");
			if((n * -1 - 1) % 5 == 0) {
				bw.write("\n");
			}
			n++;
		}
		
		
		bw.close();
		br.close();
	}

}
