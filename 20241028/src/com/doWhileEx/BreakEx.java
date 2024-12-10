package com.doWhileEx;

import java.io.*;

public class BreakEx {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100) {
				break;
			}
			i++;
			sum += i;
		}

		bw.write(sum + "\n");
		bw.write(i + "");
		
		bw.close();
		br.close();
	}

}
