package com.condition;

import java.io.*;

public class ifEx07 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("���� �Է� : ");
        bw.flush();
        int d1 = Integer.parseInt(br.readLine());
        bw.write("������ �Է� : ");
        bw.flush();
        char calc = (char)br.read();
        bw.write("���� �Է� : ");
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
        		output_result = "0���� ���� �� �����ϴ�.";
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
        	output_result = "�߸��� �������Դϴ�.";
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
