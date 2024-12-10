package com.condition;

import java.util.Scanner;

public class ifEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int x = sc.nextInt();

		System.out.print("두번째 정수 : ");
		int y = sc.nextInt();

		System.out.print("세번째 정수 : ");
		int z = sc.nextInt();

		int int1 = 0;
		int int2 = 0;
		int int3 = 0;
		
		if(x > y) {
			if(x > z) {
				if(y > z) {
					int1 = x;
					int2 = y;
					int3 = z;
				}
				else {
					int1 = x;
					int2 = z;
					int3 = y;
				}
			}
			else {
				int1 = z;
				int2 = x;
				int3 = y;
			}
		}
		else {
			if(y > z) {
				if(x > z) {
					int1 = y;
					int2 = x;
					int3 = z;
				}
				else {
					int1 = y;
					int2 = z;
					int3 = x;
				}
			}
			else {
				int1 = z;
				int2 = y;
				int3 = y;
			}
		}

		System.out.println(int1 + " >= " + int2 + " >= " + int3);
		
		//with for
		int[] num_array = {x, y, z};
		int max = num_array[0];
		int min = num_array[0];
		for(int i = 1; i < 3; i++) {
			if(max < num_array[i]) {
				max = num_array[i];
			}
			if(min > num_array[i]) {
				min = num_array[i];
			}
		}
		

		//bubble sort
		if(x < y) {
			int temp = x;
			x = y;
			y = temp;
		}
		if(y < z) {
			int temp = y;
			y = z;
			z = temp;
		}
		if(x < y) {
			int temp = x;
			x = y;
			y = temp;
		}
		
		System.out.println(x + " >= " + y + " >= " + z);
		
		sc.close();
	}

}
