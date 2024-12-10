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
        	bw.write("동작 입력 : ");
        	bw.flush();
        	String act = br.readLine();

    		if(act.equals("그만")) {
    			bw.write("종료합니다.\n");
            	bw.flush();
    			break;
    		}
    		
        	for(int i = 0; i < subject.length; i++) {
        		if(subject[i].equals(act)) {
        			bw.write(act + " 점수 : " + score[i] + "\n");
                	bw.flush();
                	continue A;
        		}
        	}

			bw.write("없는 과목입니다.\n");
        	bw.flush();
        }
        
        bw.close();
        br.close();
    }
}
