package com.variable;

import java.util.*;

public class Test12 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ����, ����, ������, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
		
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
		
		System.out.print("���� �Է� : ");
		char grade = sc.next().charAt(0); //ù��°�Ÿ� ����

		
		sc.close();
		
	}
}
