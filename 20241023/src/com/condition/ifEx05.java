package com.condition;

import java.io.*;
public class ifEx05 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("이름 : ");
        bw.flush();
        String name = br.readLine();

        bw.write("국어 점수 : ");
        bw.flush();
        int kor = Integer.parseInt(br.readLine());
        bw.write("영어 점수 : ");
        bw.flush();
        int eng = Integer.parseInt(br.readLine());
        bw.write("수학 점수 : ");
        bw.flush();
        int math = Integer.parseInt(br.readLine());

        bw.write("당신의 이름은 " + name + "입니다.\n");
        bw.write("국어점수는 " + kor + "\n");
        bw.write("영어점수는 " + eng + "\n");
        bw.write("수학점수는 " + math + "\n");
        
        bw.write("총점은 " + (kor + eng + math) + "점이고 평균은 " + ((kor + eng + math) / 3) + "점입니다.\n");
        
        kor = kor >= 100 ? 99 : kor < 0 ? 0 : kor;
        eng = eng >= 100 ? 99 : eng < 0 ? 0 : eng;
        math = math >= 100 ? 99 : math < 0 ? 0 : math;

        String[] grade = {"F", "F", "F", "F", "F", "F", "D", "C", "B", "A"};

        bw.write("국어 등급은 " + grade[kor / 10] +"입니다.\n");
        bw.write("영어 등급은 " + grade[eng / 10] +"입니다.\n");
        bw.write("수학 등급은 " + grade[math / 10] +"입니다.\n"); 

        bw.flush();
        bw.close();

        br.close();
	}

}
