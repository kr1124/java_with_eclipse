package com.switchEx;

import java.io.*;
public class SwitchEx05 {

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
        
        int tot = kor + eng + math;
        int avg = tot / 3;
        
        bw.write("총점은 " + tot + "점이고 평균은 " + avg + "점입니다.\n");

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
        
        bw.write("학점은 " + grade + "입니다.");
        bw.flush();
        bw.close();

        br.close();
	}

}
