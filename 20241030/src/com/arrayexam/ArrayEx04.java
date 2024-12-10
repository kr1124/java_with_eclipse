package com.arrayexam;

import java.io.*;

/*
 * 
 */

public class ArrayEx04 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] player = {"가위", "바위", "보"};
        String[] computer = {"보", "바위", "가위"};
        String[] result = {"이겼습니다.", "졌습니다.", "비겼습니다."};
              
        A:
        while(true) {
        	bw.write("\n가위바위보 입력 : ");
        	bw.flush();
        	String act = br.readLine();

    		if(act.equals("그만")) {
    			bw.write("종료합니다.\n");
            	bw.flush();
    			break;
    		}
    		
    		int int_com = (int)(Math.random() * 3);
    		
    		for(int i = 0; i < player.length; i++) {
        		if(player[i].equals(act)) {
        			bw.write("컴퓨터 : " + computer[int_com] + "\n");
        			bw.write(result[(int_com + i) % 3] + "\n");
        			bw.flush();
        			continue A;
        		}
        	}

			bw.write("잘못된 입력입니다.\n");
        	bw.flush();
        }
        
        bw.close();
        br.close();
    }
}
