package com.condition;

import java.io.*;

public class ifEx06 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("연도 입력 : ");
        bw.flush();
        int digit = Integer.parseInt(br.readLine());
        
        String is229 = "평년";
        if((digit % 400 == 0) || (digit % 4 == 0 && digit % 100 != 0)) {
        	is229 = "윤년";
        }
        
        bw.write(is229);
        bw.flush();
        bw.close();

        br.close();
	}

}
