package com.exam;

import java.io.*;

public class WhileExam08 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		boolean k = true;
		while(k) {
			bw.write("��ǰ�� ����ּ���. : ");
			bw.flush();
			int n = Integer.parseInt(br.readLine());
			
			switch (n) {
				case 1:
					bw.write("�ݶ�\n");
					bw.flush();
					break;
				case 2:
					bw.write("���̴�\n");
					bw.flush();
					break;
				case 3:
					bw.write("����ƾ ��\n");
					bw.flush();
					break;
				case 4:
					bw.write("���ڼ���\n");
					bw.flush();
					break;
				case 5:
					bw.write("���̽�\n");
					bw.flush();
					break;
				case 6:
					bw.write("���Ͻ�\n");
					bw.flush();
					break;
				case 0:
					k = false;
					bw.write("�����մϴ�.\n");
					bw.flush();
					break;
				default:
					bw.write("�ش��ϴ� ��ȣ�� ��ǰ�� �������� �ʽ��ϴ�.\n");
					bw.flush();
					break;
			}
		}
		
		
		bw.close();
		br.close();
	}

}
