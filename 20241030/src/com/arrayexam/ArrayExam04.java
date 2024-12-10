package com.arrayexam;

import java.io.*;

public class ArrayExam04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("학생 수 : ");
        bw.flush();
        int student_number = Integer.parseInt(br.readLine());

        int[] student_data = new int[student_number];
        double total = 0.0;
        double avg = 0.0;

        for (int i = 0; i < student_number; i++) {
            bw.write((i + 1) + "번 학생 점수 : ");
            bw.flush();

            student_data[i] = Integer.parseInt(br.readLine());
            total += student_data[i];
        }
        
        avg = total / student_number;
        avg = Math.round(avg * 10) / 10.0;
        
        bw.write("총점 : " + total + "\n");
        bw.write("평균 : " + avg + "\n");

        for (int i = 0; i < student_number; i++) {
            bw.write(i + "번 학생의 점수와 편차 : " + student_data[i] + ", " + Math.round((student_data[i] - avg) * 10) / 10.0 + "\n");
        }

        bw.flush();

        bw.close();
        br.close();
	}

}
