package com.arrayexam;

import java.io.*;

public class ArrayExam03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("학생 수 : ");
        bw.flush();
        int student_number = Integer.parseInt(br.readLine());


        String[][] student_data = new String[student_number][2];

        for (int i = 0; i < student_number; i++) {
            bw.write("이름, 전화번호 입력(" + (i + 1) + ") [공백구분] : ");
            bw.flush();

            student_data[i] = br.readLine().split(" ");
        }


        bw.write("---------------------\n");
        bw.write("   전체 학생 수 : " + student_number + "  \n");
        bw.write("---------------------\n");

        bw.write("  이름   전화번호    \n");
        for (int i = 0; i < student_number; i++) {
            bw.write(" " + student_data[i][0] + " " + student_data[i][1] + "\n");
        }

        bw.flush();

        bw.close();
        br.close();
	}

}
