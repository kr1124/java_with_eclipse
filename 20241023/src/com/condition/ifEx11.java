package com.condition;

import java.io.*;

public class ifEx11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
	        bw.write("두 자리의 정수 입력 : ");
	        bw.flush();
	        int nn = Integer.parseInt(br.readLine());

	        int a = nn / 10;
	        int b = nn % 10;
	        
	        String result = "";
	        if (a == b) {
	        	result = "같습니다.";
	        }
	        else {
	        	result = "다릅니다.";
	        }
	        
	        bw.write("10의 자리와 1의 자리가 " + result);
	        bw.flush();
		}
		catch (Exception e) {
			bw.write("제대로 된 입력을 해 주십시오.");
	        bw.flush();
			System.exit(0);
		}
		
        bw.close();
        br.close();
	}
}
