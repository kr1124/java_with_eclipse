package com.whileEx;

import java.util.*;

public class WhileEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("hello world");
			
			System.out.println("proceed?");
			char ch = sc.next().charAt(0);
			if(ch == 'n' || ch == 'N') {
				break;
			}
		}
		
		sc.close();
	}

}
