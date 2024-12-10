package com.oper;

public class OperEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;		//1101
		int b = 7; 		//0111
		
		//int c = a ^ b;  //01010
		//System.out.println(c);
		//a ^= b; 	 //a = 1010 b = 0111
		b ^= a ^= b; //a = 1010 b = 1101
		a ^= b;		 //a = 0111 b = 1101
		
		System.out.println(a);
		System.out.println(b);
	}

}
