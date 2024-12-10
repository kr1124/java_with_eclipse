package com.condition;

import java.io.*;

public class ifEx14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
	        bw.write("정수 입력 : ");
	        bw.flush();
	        int n369 = Integer.parseInt(br.readLine()); //1 ~ 999

        	bw.write("박수");
	        if(n369 / 100 != 0 && (n369 / 100 % 3) == 0) {
	        	bw.write("짝");
	        }
	        n369 %= 100;
	        if(n369 / 10 != 0 && (n369 / 10 % 3) == 0) {
	        	bw.write("짝");
	        }
	        n369 %= 10;
	        if(n369 != 0 && n369 % 3 == 0) {
	        	bw.write("짝");
	        }

	        bw.flush();
		}
		catch (Exception e) {
			bw.write("제대로 된 입력을 해 주십시오.");
	        bw.flush();
		}
		finally {
	        bw.close();
	        br.close();
		}
	}
}
