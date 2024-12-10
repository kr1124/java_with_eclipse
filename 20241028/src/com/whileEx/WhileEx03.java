package com.whileEx;

import java.io.*;

public class WhileEx03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int subject = 0;
		
		while(true) {
			System.out.print("정수 입력 : ");
			subject = Integer.parseInt(br.readLine());
			
			if(subject < 0 || subject > 100) {
				System.out.println("범위를 벗어났습니다.");
				
			}
			else {
				break;
			}
		}
		
		br.close();
	}

}
