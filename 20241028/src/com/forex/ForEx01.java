package com.forex;

import java.io.*;

public class ForEx01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        bw.write("���� �Է� : ");
        bw.flush();
        int n369 = Integer.parseInt(br.readLine()); //1 ~ 999

        bw.flush();

        bw.close();
        br.close();
	}
}
