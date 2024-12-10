package com.doWhileEx;

import java.io.*;

public class ContinueEx {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		
		for(int i = 0; i <= 10; i++) {
			if(i % 3 == 0) {
				continue;
			}
			bw.write(i + "\n");
		}
		
		bw.close();
		br.close();
	}

}
