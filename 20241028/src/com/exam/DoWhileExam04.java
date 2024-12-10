package com.exam;

import java.io.*;

public class DoWhileExam04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int i = 2;
		int j = 1;
		
		do {
			j = 1;
			do {
				bw.write(i + " * " + j + " = " + i * j + "\t");
				j++;
			} while(j <= 9);
			bw.write("\n");
			i++;
		} while(i <= 9);
		
		bw.close();
		br.close();
	}

}
