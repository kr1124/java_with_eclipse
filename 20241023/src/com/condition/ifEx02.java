package com.condition;

import java.util.Scanner;

public class ifEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int x = sc.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int y = sc.nextInt();
		
		if(x > y) {
			System.out.println("ū ���� " + x + "�Դϴ�.");
		}
		else if(x == y) {
			System.out.println("�� ���� �����ϴ�.");
		}
		else {
			System.out.println("ū ���� " + y + "�Դϴ�.");
		}
		
		

		
		sc.close();
	}

}
