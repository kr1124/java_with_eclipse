package com.condition;

import java.io.*;

public class ifEx12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
	        bw.write("���� ���� �� �Է� : ");
	        bw.flush();
	        int money = Integer.parseInt(br.readLine()); //�Է¹��� ��
	        
	        if(money == 0) {
		        bw.write("���� 0�� �Դϴ�.");
		        bw.flush();
	        	bw.close();
	        	br.close();
	        	return;
	        }

	        int m_50000 = money / 50000; //5�������� ����
	        
	        money %= 50000; // money = money % 50000;
	        int m_10000 = money / 10000; //�������� ����
	        
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
	        
	        bw.write("5������ " + m_50000 + "��, 1������ " + m_10000 + 
	        		"��, 5õ���� " + m_5000 + "��, 1õ���� " + m_1000 + 
	        		"��, 5����� " + m_500 + "��, 1����� " + m_100 +  
	        		"��, 5�ʿ��� " + m_50 + "��, 1�ʿ��� " + m_10 +   
	        		"��, 5���� " + m_5 + "��, 1���� " + m_1);
	        bw.flush();
		}
		catch (Exception e) {
			bw.write("����� �� �Է��� �� �ֽʽÿ�.");
	        bw.flush();
			System.exit(0);
		}
		
        bw.close();
        br.close();
	}
}
