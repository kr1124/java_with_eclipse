package com.exam;

import java.io.*;

public class ForExam09 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("�Է��� ���� ���� : ");
        bw.flush();
        int n = Integer.parseInt(br.readLine());

        int sum = 0; 
        for(int i = 0; i < n; i++) {
    		bw.write("���� �Է� : ");
            bw.flush();
            sum += Integer.parseInt(br.readLine());
        }
        
        bw.write("�Էµ� ������ ��� : " + (sum / (double)n));
        
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
	}

}
