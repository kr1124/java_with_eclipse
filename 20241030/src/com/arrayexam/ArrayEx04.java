package com.arrayexam;

import java.io.*;

/*
 * 
 */

public class ArrayEx04 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] player = {"����", "����", "��"};
        String[] computer = {"��", "����", "����"};
        String[] result = {"�̰���ϴ�.", "�����ϴ�.", "�����ϴ�."};
              
        A:
        while(true) {
        	bw.write("\n���������� �Է� : ");
        	bw.flush();
        	String act = br.readLine();

    		if(act.equals("�׸�")) {
    			bw.write("�����մϴ�.\n");
            	bw.flush();
    			break;
    		}
    		
    		int int_com = (int)(Math.random() * 3);
    		
    		for(int i = 0; i < player.length; i++) {
        		if(player[i].equals(act)) {
        			bw.write("��ǻ�� : " + computer[int_com] + "\n");
        			bw.write(result[(int_com + i) % 3] + "\n");
        			bw.flush();
        			continue A;
        		}
        	}

			bw.write("�߸��� �Է��Դϴ�.\n");
        	bw.flush();
        }
        
        bw.close();
        br.close();
    }
}
