package com.exam;

import java.util.*;

public class Exam001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요. : ");
		int won = sc.nextInt();
		double dollar = won / 1400.0;
		dollar = Math.round(dollar * 100) / 100.0;
		
		System.out.println(dollar + "달러 입니다.");
		
		sc.close();
	}

}
