package com.oper;

import java.util.*;

public class OperEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		int c, d, e, f, g;
		Scanner sc = new Scanner(System.in);

		System.out.print("first number : ");
		num1 = sc.nextInt();
		System.out.print("second number : ");
		num2 = sc.nextInt();
		
		c = num1 + num2;
		d = num1 - num2;
		e = num1 * num2;
		f = num2 != 0 ? num1 / num2 : num1;
		g = num1 % num2;
		
		System.out.println("==Result==");
		System.out.println(num1 + "+" + num2 + "=" + c);
		System.out.println(num1 + "-" + num2 + "=" + d);
		System.out.println(num1 + "*" + num2 + "=" + e);
		System.out.println(num1 + "/" + num2 + "=" + f);
		System.out.println(num1 + "%" + num2 + "=" + g);

		
		sc.close();
	}

}
