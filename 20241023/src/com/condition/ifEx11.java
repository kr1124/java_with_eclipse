package com.condition;

import java.io.*;

public class ifEx11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
	        bw.write("�� �ڸ��� ���� �Է� : ");
	        bw.flush();
	        int nn = Integer.parseInt(br.readLine());

	        int a = nn / 10;
	        int b = nn % 10;
	        
	        String result = "";
	        if (a == b) {
	        	result = "�����ϴ�.";
	        }
	        else {
	        	result = "�ٸ��ϴ�.";
	        }
	        
	        bw.write("10�� �ڸ��� 1�� �ڸ��� " + result);
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
