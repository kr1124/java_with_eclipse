package com.exam;

import java.io.*;

public class WhileExam05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("�¼� : ");
		bw.flush();
		
		int n = Integer.parseInt(br.readLine());
		int total = 1;
		int cnt = 0;
		
		if(n > 31) {
			bw.write("���� �ʹ� Ů�ϴ�.");
			bw.flush();
		}
		else if(n < 0) {
			bw.write("������ �������� �ʽ��ϴ�.");
			bw.flush();
		}
		else {
			while(cnt < n) {
				total *= 2;
				cnt++;
			}
			bw.write("" + total);
			bw.flush();
		}
		
		bw.close();
		br.close();
	}

}
