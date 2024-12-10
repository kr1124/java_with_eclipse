package com.oper;

public class OperEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10; //01010   00000000 00000000 00000000 00001010
		int b = 22; //10110
		
					//00010 -> and
					//11110 -> or

		System.out.println("a & b : " + (a&b));
		System.out.println("a | b : " + (a|b));
		System.out.println("~a : " + ~a);
		System.out.println("~b : " + ~b);
	}

}
