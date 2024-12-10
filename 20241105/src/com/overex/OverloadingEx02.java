package com.overex;

import java.io.*;

public class OverloadingEx02 {

	public void getLength(int a) {
		String s = String.valueOf(a);
		getLength(s);
	}
	public void getLength(int a, int b) {

	}
	public void getLength(float a) {
		String s = String.valueOf(a);
		getLength(s);
	}
	
	private void getLength(String str) {
		System.out.println("입력한 값의 길이 : " + str.length());
	}
	

	
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		OverloadingEx02 oe2 = new OverloadingEx02();
		oe2.getLength(1000);
		oe2.getLength(580.f);
		oe2.getLength(3.14f);
		
		br.close();
		bw.close();
	}

}
