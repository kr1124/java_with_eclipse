package com.condition;

import java.io.*;

public class ifEx12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
	        bw.write("정수 단위 돈 입력 : ");
	        bw.flush();
	        int money = Integer.parseInt(br.readLine()); //입력받은 돈
	        
	        if(money == 0) {
		        bw.write("돈이 0원 입니다.");
		        bw.flush();
	        	bw.close();
	        	br.close();
	        	return;
	        }

	        int m_50000 = money / 50000; //5만원권의 개수
	        
	        money %= 50000; // money = money % 50000;
	        int m_10000 = money / 10000; //만원권의 개수
	        
	        money %= 10000;
	        int m_5000 = money / 5000;
	        money %= 5000;
	        int m_1000 = money / 1000;
	        money %= 1000;
	        int m_500 = money / 500;
	        money %= 500;
	        int m_100 = money / 100;
	        money %= 100;
	        int m_50 = money / 50;
	        money %= 50;
	        int m_10 = money / 10;
	        money %= 10;
	        int m_5 = money / 5;
	        money %= 5;
	        int m_1 = money / 1;
	        money %= 1;
	        
	        bw.write("5만원권 " + m_50000 + "개, 1만원권 " + m_10000 + 
	        		"개, 5천원권 " + m_5000 + "개, 1천원권 " + m_1000 + 
	        		"개, 5백원권 " + m_500 + "개, 1백원권 " + m_100 +  
	        		"개, 5십원권 " + m_50 + "개, 1십원권 " + m_10 +   
	        		"개, 5원권 " + m_5 + "개, 1원권 " + m_1);
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
