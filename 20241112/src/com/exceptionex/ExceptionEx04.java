package com.exceptionex;

import buf.cio;

/*
 * 
 * 
 * 
 * */



public class ExceptionEx04 {
	
	int[] ss;	
	
	public ExceptionEx04() {
		ss = new int[3];
	}
	
	public void program() {
		for (int i = 0; i <= ss.length; i++) {
			cio.wnlf("for���� ���� " + i + "��°");
			
			try {
				cio.wnlf(ss[i]);
			}
			catch (Exception e) {
				cio.wnlf("Exception �߻� " + e);
				e.printStackTrace();
				e.getMessage();
				return;
			}
			finally {
				//cio.wnlf("finally");
			}
			cio.wnlf("for���� �� " + i + "��°");
		}
	}
	
	public static void main(String[] args) {
		ExceptionEx04 e4 = new ExceptionEx04();
		e4.program();
	}
}
