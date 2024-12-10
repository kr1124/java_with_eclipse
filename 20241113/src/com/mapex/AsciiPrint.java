package com.mapex;

import buf.cio;

public class AsciiPrint {

	public static void main(String[] args) {
		char ch = 0;
		
		for(int i = 0; i < 128; i++) {
			if(i % 10 == 0) {
				cio.nl();
			}
			cio.w(ch++);
		}
		cio.f();
	}

}
