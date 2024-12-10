package com.oper;

import java.io.*;
public class OperExam03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int digit = Integer.parseInt(br.readLine());
        
        String is229 = "";
        is229 = digit % 400 == 0 ? "À±³â" : digit % 4 == 0 && digit % 100 != 0 ? "À±³â" : "Æò³â";

        bw.write(is229);
        bw.flush();
        bw.close();

        br.close();
	}

}
