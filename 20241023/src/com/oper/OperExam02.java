package com.oper;

import java.io.*;

public class OperExam02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int digit = Integer.parseInt(br.readLine());

        String isOdd = digit < 0 ? "擠熱" : digit == 0 ? "0" : (digit & 1) == 1 ? "�汝�" : "礎熱";

		/*
		 * if((digit & msb) >> 31 == 1) { isOdd = "擠熱"; } else { if (digit == 0) { isOdd
		 * = "0"; } else { if((digit & 1) == 1) { isOdd = "�汝�"; } else { isOdd = "礎熱"; }
		 * } }
		 */
        
        bw.write(isOdd);
        bw.flush();
        bw.close();

        br.close();
	}

}
