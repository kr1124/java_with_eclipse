package com.condition;

import java.io.*;

public class ifEx09 {

	public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        bw.write("입력 : ");
//        bw.flush();
//        String alpha = br.readLine();
//
//        br.close();
//        
//        String a_v = "AEIOUaeiou";
//        String a_m = "BCDFGHJKLMNPQRSTVWXYZbcdfghijklmnpqrstvwxyz";
//        
//        if(a_v.contains(alpha)) {
//        	result = "모음입니다.";
//        }
//        else if(a_m.contains(alpha)) {
//        	result = "자음입니다.";
//        }
//        else {
//        	result = "알파벳이 아닙니다.";
//        }
//        
//        bw.write(result);
//        bw.flush();
//        bw.close();

        System.out.print("입력 : ");
        int a = System.in.read();

        String result = "";

        if(a >= 65 && a <= 122) {
        	result = "자음입니다.";
        	if(a == 65 || a == 69 || a == 73 || a == 79 || a == 85 || 
        	   a == 97 || a == 101 || a == 105 || a == 111 || a == 117) {
            	result = "모음입니다.";
        	}
        }
        else {
        	result = "알파벳이 아닙니다.";
        }
        
        System.out.println(result);
	}
}
