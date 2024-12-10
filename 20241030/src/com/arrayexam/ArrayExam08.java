package com.arrayexam;

import java.io.*;

public class ArrayExam08 {
    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] n3 = new int[400];

        for(int i = 0; i < n3.length; i++) {
        	int ti = i;
        	do {
        		if(ti % 10 % 3 == 0 && ti % 10 != 0) {
        			n3[i] += 1;
        		}
        		ti /= 10;
        	} while (ti > 0);
        	
        	if(n3[i] != 0) {
        		bw.write(i + " ¹Ú¼ö");
        		for(int j = 0; j < n3[i]; j++) {
        			bw.write("Â¦");
        		}
        		bw.write("\n");
        	}
        }

        bw.close();
        br.close();
    }
}
