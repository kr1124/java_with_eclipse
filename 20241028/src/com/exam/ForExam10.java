package com.exam;

import java.io.*;

public class ForExam10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("½Â¼ö : ");
        bw.flush();
        int n = Integer.parseInt(br.readLine());

        int res = 1; 
        for(int i = 0; i < n; i++) {
        	res *= 3;
        }
        
        bw.write("" + res);
        
        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
	}

}
