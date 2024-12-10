package com.variable;

import java.util.*;

public class Test12 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 도시, 나이, 몸무게, 독신여부를 빈칸으로 분리하여 입력하세요.");
		
		String name, city;
		int age;
		double weight;
		boolean isSingle;

		System.out.print("name : ");
		name = sc.next();
		System.out.print("city : ");
		city = sc.next();
		System.out.print("age : ");
		age = sc.nextInt();
		System.out.print("weight : ");
		weight =sc.nextDouble();
		System.out.print("is Single : ");
		isSingle = sc.nextBoolean();
		
		System.out.print("학점 입력 : ");
		char grade = sc.next().charAt(0); //첫번째거만 따옴

		
		sc.close();
		
	}
}
