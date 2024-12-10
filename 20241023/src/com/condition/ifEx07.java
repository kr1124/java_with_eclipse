package com.condition;

import java.io.*;

public class ifEx07 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("정수 입력 : ");
        bw.flush();
        int d1 = Integer.parseInt(br.readLine());
        bw.write("연산자 입력 : ");
        bw.flush();
        char calc = (char)br.read();
        bw.write("정수 입력 : ");
        bw.flush();
        int d2 = Integer.parseInt(br.readLine());
        br.close();
        
        int result1 = 0;
        double result2 = 0.0;
        String output_result = "";
        int indicator = 0;
                
        if(calc == '+') {
        	result1 = d1 + d2;
        }
        else if(calc == '-') {
        	result1 = d1 - d2;
        }
        else if(calc == '*') {
        	result1 = d1 * d2;
        }
        else if(calc == '/') {
        	if(d2 == 0) {
        		indicator = 1;
        		output_result = "0으로 나눌 수 없습니다.";
        	}
        	else {
        		indicator = 2;
        		result2 = d1 * 1.0 / d2;
        	} 
        }
        else if(calc == '%') {
        	
        }
        else {
    		indicator = 1;
        	output_result = "잘못된 연산자입니다.";
        }

        if(indicator == 0) {
        	output_result = d1 + " + " + d2 + " = " + result1;
        }
        else if(indicator == 2) {
        	output_result = d1 + " + " + d2 + " = " + result2;
        }
        
        bw.write(output_result);
        bw.flush();
        bw.close();

        br.close();
	}

}
