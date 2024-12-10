package com.exceptionex;

import buf.cio;

/*
 * 
 * 
 * 
 * */



public class ExceptionEx03 {
	
	
	public static void main(String[] args) {
		try {
			throw new Exception();
		}
		catch (Exception e) {
			cio.wnlf("예외 발생");
			e.getMessage();
		}
	}
}
