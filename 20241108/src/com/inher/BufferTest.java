package com.inher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import buf.cio;

public class BufferTest {

	public static String buffer_readline() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String s = br.readLine();
			return s;
			
		} catch(IOException e) {
			return "IOException Occured";
		}
	}
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out));
	static BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		bw2.write("slkfjl");
		bw2.flush();
		//bw2.close();
		
		cio.wnlf("dlfkjl");
		
		
		
		bw1.write("ldkfjl");
		bw1.close();

	}

}
