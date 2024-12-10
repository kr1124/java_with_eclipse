package com.exceptionex;

import buf.cio;

/*
 * 
 * 
 * 
 * */

public class ExceptionEx02 {
	public static void main(String[] args) {
		cio.wnl(1);
		cio.wnlf(2);
		
		try {
			cio.wnl(3);
			cio.wnlf(4);
		}
		catch(Exception e) {
			cio.wnlf(5);
		}
		cio.wnlf(6);
	}
}
