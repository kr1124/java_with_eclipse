package com.arrayexam;

import java.io.*;

public class ArrayExam01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] subname = {"국어", "영어", "수학"};
		int score[] = new int[subname.length + 1];

		for(int i = 0; i < score.length - 1; i++) {
			do {
				bw.write(subname[i] + " 점수 입력 : ");
				bw.flush();
				score[i] = Integer.parseInt(br.readLine());
			} while(score[i] < 0 || score[i] > 100);
			score[score.length - 1] += score[i];
		}
		
		double avg = score[score.length - 1] / 3.0;
		avg = Math.round(avg * 100) / 100.0;
		
		bw.write("합계 : " + score[score.length - 1] + ", 평균 : " + avg);
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
