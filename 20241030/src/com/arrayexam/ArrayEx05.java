package com.arrayexam;

import java.io.*;

/*
 * 
 */

public class ArrayEx05 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("이름 입력 : ");
        bw.flush();
        String name = br.readLine();
        
        bw.write("주민번호 입력 (123456-1234567) : ");
        bw.flush();
        String unique_code = br.readLine();
        
        int birth_year = 1999;
        int birth_month = 1;
        int birth_date = 2;

        birth_year = (unique_code.charAt(0) - 48) * 10 + (unique_code.charAt(1) - 48);
        birth_month = (unique_code.charAt(2) - 48) * 10 + (unique_code.charAt(3) - 48);
        birth_date = (unique_code.charAt(4) - 48) * 10 + (unique_code.charAt(5) - 48); 
        

        String[] location = {"서울"};
        
        bw.close();
        br.close();
    }
}
