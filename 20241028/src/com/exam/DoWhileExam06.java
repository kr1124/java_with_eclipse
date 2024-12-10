package com.exam;

import java.io.*;

public class DoWhileExam06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	    
        for(int n369 = 0; n369 < 40; n369++) {
        	do {
    			if(n369 % 10 % 3 == 0 && n369 % 10 != 0 && n369 % 3 != 0) {
    				bw.write("¦");
    			}
    			n369 %= 10;
    		} while((n369 /= 10) != 0);
        	bw.write("\n");
        }
		
        
		bw.close();
		br.close();
	}

}
