package com.exam;

import java.io.*;

public class ForExam01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        bw.write("���� �Է� : ");
        bw.flush();
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
			sum += i;
		}
        
        bw.write("0���� " + n + "������ �հ�:" + sum);
        bw.flush();

        bw.close();
        br.close();
	}

}
