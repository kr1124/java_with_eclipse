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

		System.out.println("���� ���� : ");
		g1 = sc.nextInt();
		System.out.println("���� ���� : ");
		g2 = sc.nextInt();
		System.out.println("���� ���� : ");
		g3 = sc.nextInt();
		System.out.println("��ȸ ���� : ");
		g4 = sc.nextInt();
		System.out.println("���� ���� : ");
		g5 = sc.nextInt();
		
		int gall = g1 + g2 + g3 + g4 + g5;
		
		System.out.println("������ " + gall + "��, ����� " + gall / 5.0 + "�� �Դϴ�.");
		
		sc.close();
	}
}
