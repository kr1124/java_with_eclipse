package com.exam;

import java.util.*;

public class Exam001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���. : ");
		int won = sc.nextInt();
		double dollar = won / 1400.0;
		dollar = Math.round(dollar * 100) / 100.0;
		
		System.out.println(dollar + "�޷� �Դϴ�.");
		
		sc.close();
	}

}
