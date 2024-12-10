package com.dbex;

import java.util.Scanner;

public class Testest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		Scanner sc = new Scanner(System.in);
		int won = sc.nextInt();
		double dollar = sc.nextDouble();

		a^=b;
		b^=a;
		a^=b;
		
		System.out.println(a + " " + b);
		
	}

}
