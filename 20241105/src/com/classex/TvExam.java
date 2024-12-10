package com.classex;

import java.io.*;

public class TvExam {

	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Tv[] tvArr = new Tv[3];
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channelUp();
			
		}


		
		br.close();
		bw.close();
	}
}
