package com.condition;

import java.io.*;

public class ifEx10 {

	public static void main(String[] args) throws IOException {

        System.out.print("ют╥б : ");
        char a = (char)System.in.read();

        if(a >= 'A' && a <= 'Z') {
        	a += 32;
        }
        else if(a >= 'a' && a <= 'z') {
        	a -= 32;
        }
        
        System.out.println(a);
	}
}
