package com.objex;

import java.io.*;

public class Hap {
	private int su;
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		do {
			bw.write("정수 입력 : ");
			bw.flush();
			su = Integer.parseInt(br.readLine());
		} while(su < 1 || su > 1000);
		br.close();
		bw.close();
	}
	
	public int sum() {
		int s = 0;
		for(int i = 1; i <= su; i++) {
			s += i;
		}
		
		return s;
	}
	
	public void write(int s) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("1 ~ " + su + "까지의 합계 : " + s);
		bw.close();
	}
}
