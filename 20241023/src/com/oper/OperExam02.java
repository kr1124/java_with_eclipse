package com.oper;

import java.io.*;

public class OperExam02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int digit = Integer.parseInt(br.readLine());

        String isOdd = digit < 0 ? "����" : digit == 0 ? "0" : (digit & 1) == 1 ? "Ȧ��" : "¦��";

		/*
		 * if((digit & msb) >> 31 == 1) { isOdd = "����"; } else { if (digit == 0) { isOdd
		 * = "0"; } else { if((digit & 1) == 1) { isOdd = "Ȧ��"; } else { isOdd = "¦��"; }
		 * } }
		 */
        
        bw.write(isOdd);
        bw.flush();
        bw.close();

        br.close();
	}

}
