package com.condition;

import java.util.Scanner;

public class ifEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int x = sc.nextInt();

		System.out.print("�ι�° ���� : ");
		int y = sc.nextInt();

		System.out.print("����° ���� : ");
		int z = sc.nextInt();

		//bubble sort
		if(x > y) {
			x ^= y;
			y ^= x;
			x ^= y;
		}
		if(y > z) {
			z ^= y;
			y ^= z;
			z ^= y;
		}
		if(x > y) {
			x ^= y;
			y ^= x;
			x ^= y;
		}
		
		System.out.println(x + " <= " + y + " <= " + z);
		
		sc.close();
	}

}
