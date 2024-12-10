package com.condition;

import java.io.*;
public class ifEx05 {

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
        
        bw.write("������ " + (kor + eng + math) + "���̰� ����� " + ((kor + eng + math) / 3) + "���Դϴ�.\n");
        
        kor = kor >= 100 ? 99 : kor < 0 ? 0 : kor;
        eng = eng >= 100 ? 99 : eng < 0 ? 0 : eng;
        math = math >= 100 ? 99 : math < 0 ? 0 : math;

        String[] grade = {"F", "F", "F", "F", "F", "F", "D", "C", "B", "A"};

        bw.write("���� ����� " + grade[kor / 10] +"�Դϴ�.\n");
        bw.write("���� ����� " + grade[eng / 10] +"�Դϴ�.\n");
        bw.write("���� ����� " + grade[math / 10] +"�Դϴ�.\n"); 

        bw.flush();
        bw.close();

        br.close();
	}

}
