package com.objex;

import java.io.*;

public class MethodEx03 {
	public static void main(String[] args) throws IOException{
		Hap h = new Hap();
		h.input();
		int s = h.sum();
		h.write(s);
	}
}
