package com.arrayexam;

import java.io.*;

public class ArrayExam02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] intArr = new int[5];
		int max = 0;

		for(int i = 0; i < intArr.length; i++) {
			bw.write("정수 입력 : ");
			bw.flush();
			intArr[i] = Integer.parseInt(br.readLine());
			
			if(intArr[i] > max ) {
				max = intArr[i];
			}
		}

		bw.write("최댓값 : " + max);
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
