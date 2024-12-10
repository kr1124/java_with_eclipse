package com.objex;

import java.io.*;

public class MethodEx02 {
	public void increase(int[] n) {
		for(int i = 0; i < n.length; i++) {
			n[i]++;
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int ref[] = {100, 800, 1000};
		
		MethodEx02 mm = new MethodEx02();
		mm.increase(ref);
		
		for(int i = 0; i < ref.length; i++) {
			bw.write(ref[i] + "\t");
		}
		bw.close();
		
		
	}
}
