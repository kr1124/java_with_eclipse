package com.condition;

import java.io.*;

public class ifEx06 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("���� �Է� : ");
        bw.flush();
        int digit = Integer.parseInt(br.readLine());
        
        String is229 = "���";
        if((digit % 400 == 0) || (digit % 4 == 0 && digit % 100 != 0)) {
        	is229 = "����";
        }
        
        bw.write(is229);
        bw.flush();
        bw.close();

        br.close();
	}

}
