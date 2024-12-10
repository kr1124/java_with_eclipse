package com.exam;

import java.io.*;

public class ForExam06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("���� �Է� : ");
        bw.flush();
        int n = Integer.parseInt(br.readLine());

        int sum_odds = 0;
        int sum_ends = 0;
        int sum_total = 0;

        for(int i = 1; i <= n; i++) {
        	if(i % 2 == 0) {
        		sum_ends += i;
        	}
        	else {
        		sum_odds += i;
        	}
        	sum_total += i;
        	
        	if(i % 10 == 0) {
        		bw.write("1 ~ " + i + "������ Ȧ�� �� : " + sum_odds + "\n");
        		bw.write("1 ~ " + i + "������ ¦�� �� : " + sum_ends + "\n");
        		bw.write("1 ~ " + i + "������ ��ü �� : " + sum_total + "\n");
        	}
        }

        bw.write("Ȧ�� �� : " + sum_odds + "\n");
        bw.write("¦�� �� : " + sum_ends + "\n");
        bw.write("��ü �� : " + sum_total);
        bw.flush();
        
        bw.close();
        br.close();
	}

}
