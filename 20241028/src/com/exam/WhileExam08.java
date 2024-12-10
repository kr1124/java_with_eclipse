package com.exam;

import java.io.*;

public class WhileExam08 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		boolean k = true;
		while(k) {
			bw.write("상품을 골라주세요. : ");
			bw.flush();
			int n = Integer.parseInt(br.readLine());
			
			switch (n) {
				case 1:
					bw.write("콜라\n");
					bw.flush();
					break;
				case 2:
					bw.write("사이다\n");
					bw.flush();
					break;
				case 3:
					bw.write("마운틴 듀\n");
					bw.flush();
					break;
				case 4:
					bw.write("초코송이\n");
					bw.flush();
					break;
				case 5:
					bw.write("에이스\n");
					bw.flush();
					break;
				case 6:
					bw.write("웨하스\n");
					bw.flush();
					break;
				case 0:
					k = false;
					bw.write("종료합니다.\n");
					bw.flush();
					break;
				default:
					bw.write("해당하는 번호의 상품이 존재하지 않습니다.\n");
					bw.flush();
					break;
			}
		}
		
		
		bw.close();
		br.close();
	}

}
