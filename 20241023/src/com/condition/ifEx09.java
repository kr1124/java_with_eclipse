package com.condition;

import java.io.*;

public class ifEx09 {

	public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        bw.write("�Է� : ");
//        bw.flush();
//        String alpha = br.readLine();
//
//        br.close();
//        
//        String a_v = "AEIOUaeiou";
//        String a_m = "BCDFGHJKLMNPQRSTVWXYZbcdfghijklmnpqrstvwxyz";
//        
//        if(a_v.contains(alpha)) {
//        	result = "�����Դϴ�.";
//        }
//        else if(a_m.contains(alpha)) {
//        	result = "�����Դϴ�.";
//        }
//        else {
//        	result = "���ĺ��� �ƴմϴ�.";
//        }
//        
//        bw.write(result);
//        bw.flush();
//        bw.close();

        System.out.print("�Է� : ");
        int a = System.in.read();

        String result = "";

        if(a >= 65 && a <= 122) {
        	result = "�����Դϴ�.";
        	if(a == 65 || a == 69 || a == 73 || a == 79 || a == 85 || 
        	   a == 97 || a == 101 || a == 105 || a == 111 || a == 117) {
            	result = "�����Դϴ�.";
        	}
        }
        else {
        	result = "���ĺ��� �ƴմϴ�.";
        }
        
        System.out.println(result);
	}
}
