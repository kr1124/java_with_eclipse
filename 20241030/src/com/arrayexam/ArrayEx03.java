package com.arrayexam;

import java.io.*;

/*
 * 
 */

public class ArrayEx03 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] subject = {"JAVA", "C++", "HTML5", "CSS", "JAVASCRIPT"};
        int[] score = {95, 88, 76, 62, 55};

        A:
        while(true) {
        	bw.write("���� �Է� : ");
        	bw.flush();
        	String act = br.readLine();

    		if(act.equals("�׸�")) {
    			bw.write("�����մϴ�.\n");
            	bw.flush();
    			break;
    		}
    		
        	for(int i = 0; i < subject.length; i++) {
        		if(subject[i].equals(act)) {
        			bw.write(act + " ���� : " + score[i] + "\n");
                	bw.flush();
                	continue A;
        		}
        	}

			bw.write("���� �����Դϴ�.\n");
        	bw.flush();
        }
        
        bw.close();
        br.close();
    }
}
