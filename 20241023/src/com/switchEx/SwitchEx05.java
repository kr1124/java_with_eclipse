package com.switchEx;

import java.io.*;
public class SwitchEx05 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("�̸� : ");
        bw.flush();
        String name = br.readLine();

        bw.write("���� ���� : ");
        bw.flush();
        int kor = Integer.parseInt(br.readLine());
        bw.write("���� ���� : ");
        bw.flush();
        int eng = Integer.parseInt(br.readLine());
        bw.write("���� ���� : ");
        bw.flush();
        int math = Integer.parseInt(br.readLine());

        bw.write("����� �̸��� " + name + "�Դϴ�.\n");
        bw.write("���������� " + kor + "\n");
        bw.write("���������� " + eng + "\n");
        bw.write("���������� " + math + "\n");
        
        int tot = kor + eng + math;
        int avg = tot / 3;
        
        bw.write("������ " + tot + "���̰� ����� " + avg + "���Դϴ�.\n");

        String grade = "";
        switch (avg / 10) {
	        case 10:
	        case 9:
	        	grade = "A";
	        	break;
	        case 8:
	        	grade = "B";
	        	break;
	        case 7:
	        	grade = "C";
	        	break;
	        case 6:
	        	grade = "D";
	        	break;
	        default:
	        	grade = "F";
	        	break;
        }
        
        bw.write("������ " + grade + "�Դϴ�.");
        bw.flush();
        bw.close();

        br.close();
	}

}
