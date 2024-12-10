package com.exceptionex;

import buf.cio;

/*
 * 
 * 
 * 
 * */

public class ExceptionEx01 {
	public static void main(String[] args) {
		int number = 50;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 5);
				cio.wnlf(result);
			}
			catch(ArithmeticException ae) {
				cio.wnlf("0으로 나눌 수 없습니다.");
			}
			
			
		}
	}
}
