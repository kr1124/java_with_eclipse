package com.variable;

import java.io.*;

public class Test10 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int g1 = 0;
		int g2 = 0;
		int g3 = 0;
		int g4 = 0;
		int g5 = 0;
		
		System.out.println("국어 점수 : ");
		g1 = Integer.parseInt(br.readLine());
		System.out.println("영어 점수 : ");
		g2 = Integer.parseInt(br.readLine());
		System.out.println("수학 점수 : ");
		g3 = Integer.parseInt(br.readLine());
		System.out.println("사회 점수 : ");
		g4 = Integer.parseInt(br.readLine());
		System.out.println("과학 점수 : ");
		g5 = Integer.parseInt(br.readLine());

		br.close();
		
		int gall = g1 + g2 + g3 + g4 + g5;
		
		bw.write("총점은 " + gall + "점, 평균은 " + gall / 5 + "점 입니다.");
		
		bw.flush();
		bw.close();
	}

}
