package com.exam;

import java.io.*;

public class ForExam02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int k = 1;
		double sum = 0.0;
		int count = 0;
		
		while(k == 1) {
			bw.write("�Ǽ� �Է� : ");
	        bw.flush();
	        double n = Double.parseDouble(br.readLine());
	     
	        if(n < 0.0) {
	        	k = 0;
	        	break;
	        }

	        sum += n;
	        count++;
		}
		
		
        bw.write("���ݱ����� ��� : " + sum / count);
        bw.flush();

        bw.close();
        br.close();
	}

}
