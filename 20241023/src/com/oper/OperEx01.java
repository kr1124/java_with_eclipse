package com.oper;

public class OperEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 30;
		int max = 0;
		
		max = a > b ? a++ : b++;

		System.out.println(max);
		System.out.println(a);
		System.out.println(b);
	}

}
