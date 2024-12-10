package com.variable;

import java.util.*;

public class Test13 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int g1 = 0;
		int g2 = 0;
		int g3 = 0;
		int g4 = 0;
		int g5 = 0;

		System.out.println("국어 점수 : ");
		g1 = sc.nextInt();
		System.out.println("영어 점수 : ");
		g2 = sc.nextInt();
		System.out.println("수학 점수 : ");
		g3 = sc.nextInt();
		System.out.println("사회 점수 : ");
		g4 = sc.nextInt();
		System.out.println("과학 점수 : ");
		g5 = sc.nextInt();
		
		int gall = g1 + g2 + g3 + g4 + g5;
		
		System.out.println("총점은 " + gall + "점, 평균은 " + gall / 5.0 + "점 입니다.");
		
		sc.close();
	}
}
