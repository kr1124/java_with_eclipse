package com.sungjuk;

import java.io.*;

public class SungjukMain {

	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Sungjuk sj = new Sungjuk();
		sj.setCount();
		sj.input();

//		while(true) {
//			bw.write("1. 인원수 입력 : ");
//			bw.flush();
//			
//		}
		
		
		
		
		br.close();
		bw.close();
	}

}
