package com.exam;

import java.io.*;

public class WhileExam06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int total = 0;		
		int n = 1;
		int sim = 1;
		
		while(n < 101) {
//			if(n % 2 == 0) {
//				total += n * n;
//			}
//			else {
//				total -= n * n;
//			}
			
//			int ah = ((n % 2) * 2);
//			total += n * n * ah;
			
			sim = -sim;
			total += sim * n * n;
			
			n++;
		}
		
		bw.write("" + total);
		
		bw.close();
		br.close();
	}

}
