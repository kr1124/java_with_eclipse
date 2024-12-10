package com.exam;

import java.io.*;

public class ForExam04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("���� �Է� : ");
        bw.flush();
        int a = Integer.parseInt(br.readLine());
		bw.write("���� �Է� : ");
        bw.flush();
        int b = Integer.parseInt(br.readLine());
        
        int sum = 0;
        
        if(a > b) {
        	a ^= b;
        	b ^= a;
        	a ^= b;
        }

        for(int i = a; i <= b; i++) {
        	sum += i;
        }
        
        bw.write("������ �� : " + sum);
        bw.flush();
        
        bw.close();
        br.close();
	}

}
