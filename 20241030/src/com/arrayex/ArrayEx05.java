package com.arrayex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ArrayEx05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// TODO Auto-generated method stub
		char[] arr_ch = new char[26];
		for(int i = 0; i < arr_ch.length; i++) {
			arr_ch[i] = (char)('A' + i);
			bw.write(arr_ch[i] + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
