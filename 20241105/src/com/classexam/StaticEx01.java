package com.classexam;

import java.io.IOException;

import buf.cio;

class StaticEx {
	int x;
	static int y;
}

public class StaticEx01 {
	public static void main(String[] args) throws IOException{
		cio.w(StaticEx.y + "");
		
		StaticEx s = new StaticEx();
		cio.w(s.x + "");
		s.x = 100;
		StaticEx.y = 200;
		
		cio.nl();
		cio.w(s.x + " " + StaticEx.y);
		cio.nl();
		cio.f();
		
	}
}
