package com.condition;

import java.io.*;

public class ifEx13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
	        bw.write("���� �Է� : ");
	        bw.flush();
	        int n1 = Integer.parseInt(br.readLine());
	        bw.write("���� �Է� : ");
	        bw.flush();
	        int n2 = Integer.parseInt(br.readLine());
	        bw.write("���� �Է� : ");
	        bw.flush();
	        int n3 = Integer.parseInt(br.readLine());

	        if(n1 > n2) {
	        	n1 ^= n2;
	        	n2 ^= n1;
	        	n1 ^= n2;
	        }
	        if(n2 > n3) {
	        	n2 ^= n3;
	        	n3 ^= n2;
	        	n2 ^= n3;
	        }
	        if(n1 > n2) {
	        	n1 ^= n2;
	        	n2 ^= n1;
	        	n1 ^= n2;
	        }
	        
	        if(n1 > n2) {
	        	System.out.print("n1�� Ů�ϴ�.");
	        }
	        
	        
	        

	        bw.write(n2);
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
