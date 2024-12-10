package com.condition;

import java.util.Scanner;

public class ifEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int x = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int y = sc.nextInt();
		
		if(x > y) {
			System.out.println("큰 수는 " + x + "입니다.");
		}
		else if(x == y) {
			System.out.println("두 수가 같습니다.");
		}
		else {
			System.out.println("큰 수는 " + y + "입니다.");
		}
		
		

		
		sc.close();
	}

}
