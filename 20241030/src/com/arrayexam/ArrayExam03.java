package com.arrayexam;

import java.io.*;

public class ArrayExam03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("�л� �� : ");
        bw.flush();
        int student_number = Integer.parseInt(br.readLine());


        String[][] student_data = new String[student_number][2];

        for (int i = 0; i < student_number; i++) {
            bw.write("�̸�, ��ȭ��ȣ �Է�(" + (i + 1) + ") [���鱸��] : ");
            bw.flush();

            student_data[i] = br.readLine().split(" ");
        }


        bw.write("---------------------\n");
        bw.write("   ��ü �л� �� : " + student_number + "  \n");
        bw.write("---------------------\n");

        bw.write("  �̸�   ��ȭ��ȣ    \n");
        for (int i = 0; i < student_number; i++) {
            bw.write(" " + student_data[i][0] + " " + student_data[i][1] + "\n");
        }

        bw.flush();

        bw.close();
        br.close();
	}

}
