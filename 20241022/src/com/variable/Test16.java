package com.variable;

import java.io.*;

public class Test16 {

	public static void main(String[] args) throws IOException{
		int num1;
		int num2;
		
		System.out.print("숫자 입력 : ");
		num1 = System.in.read();
		System.out.println(num1 - 48);

		System.in.read();
		System.in.read();
		//System.in.skip(2); //or, use this
		
		System.out.print("숫자 입력 : ");
		num2 = System.in.read();
		System.out.println(num2 - 48);
		/*
		 * System.out.println(num1 - 48); System.out.println(num1 - '0');
		 */
	}

}
