package com.variable;

import java.io.*;

public class Test14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.write(97);
		System.out.flush();
		System.out.println();
		
		byte[] by = {'J', 'A', 'V', 'A'};
		System.out.write(by, 0, 4);
	}

}
