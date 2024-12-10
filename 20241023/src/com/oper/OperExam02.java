package com.oper;

import java.io.*;

public class OperExam02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int digit = Integer.parseInt(br.readLine());

        String isOdd = digit < 0 ? "À½¼ö" : digit == 0 ? "0" : (digit & 1) == 1 ? "È¦¼ö" : "Â¦¼ö";

		/*
		 * if((digit & msb) >> 31 == 1) { isOdd = "À½¼ö"; } else { if (digit == 0) { isOdd
		 * = "0"; } else { if((digit & 1) == 1) { isOdd = "È¦¼ö"; } else { isOdd = "Â¦¼ö"; }
		 * } }
		 */
        
        bw.write(isOdd);
        bw.flush();
        bw.close();

        br.close();
	}

}
