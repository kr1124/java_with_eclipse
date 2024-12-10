package com.doWhileEx;

import java.io.*;

public class DoWhileEx01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		} while(i < 10);
		
		System.out.println(sum);
		br.close();
	}

}
