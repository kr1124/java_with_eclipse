package com.condition;

import java.io.*;

public class ifEx14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
	        bw.write("���� �Է� : ");
	        bw.flush();
	        int n369 = Integer.parseInt(br.readLine()); //1 ~ 999

        	bw.write("�ڼ�");
	        if(n369 / 100 != 0 && (n369 / 100 % 3) == 0) {
	        	bw.write("¦");
	        }
	        n369 %= 100;
	        if(n369 / 10 != 0 && (n369 / 10 % 3) == 0) {
	        	bw.write("¦");
	        }
	        n369 %= 10;
	        if(n369 != 0 && n369 % 3 == 0) {
	        	bw.write("¦");
	        }

	        bw.flush();
		}
		catch (Exception e) {
			bw.write("����� �� �Է��� �� �ֽʽÿ�.");
	        bw.flush();
		}
		finally {
	        bw.close();
	        br.close();
		}
	}
}
