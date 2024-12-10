package com.arrayexam;

import java.io.*;

public class ArrayEx02 {
    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("�л� �� �Է� : ");
        bw.flush();
        int human = Integer.parseInt(br.readLine());
        String[] name = new String[human];
        
        String[][] subject = new String[human][];
        int[][] score = new int[human][];
        
        double[] avg = new double[human];
        char[] grade = new char[human];
        String grade_list = "FFFFFFDCBAA";
        int[] rank = new int[human];        

        for(int i = 0; i < human; i++) {
        	//bw.write((i + 1) + "��° �л��� �̸� �Է� : ");
        	bw.write("�л��� �̸� �Է� : ");
        	bw.flush();
        	name[i] = br.readLine();

            bw.write("���� �� �Է� : ");
            bw.flush();
            int sub_num = Integer.parseInt(br.readLine());
            subject[i] = new String[sub_num];
        	
    		//bw.write("-�л� " + name[i] + "-\n");
        	for(int j = 0; j < subject[i].length; j++) {
        		//bw.write("\t" + subject[j] + " ���� �Է� : ");
        		bw.write((j + 1) + "��° ���� : ");
            	bw.flush();
            	subject[i][j] = br.readLine();
        	}
        	
        	score[i] = new int[sub_num + 1];
        	for(int j = 0; j < subject[i].length; j++) {
        		bw.write("\t" + subject[i][j] + " ���� �Է� : ");
        		bw.flush();
            	score[i][j] = Integer.parseInt(br.readLine());
            	
            	score[i][score[i].length - 1] += score[i][j];
        	}

        	avg[i] = score[i][score[i].length - 1] * 1.0 / subject[i].length;
        	avg[i] = (int)(avg[i] * 100 + 0.5) / 100.0;
        }
        
        bw.newLine();
        
        //grade
        for(int i = 0; i < human; i++) {
        	int tg = (int)(avg[i] / 10);
        	grade[i] = grade_list.charAt(tg);
        }
        
        //rank
        for(int i = 0; i < human; i++) {
        	rank[i]++;
        	for(int j = 0; j < human; j++) {
        		if(avg[i] < avg[j]) {
        			rank[i]++;
        		}
        	}
        }
        
        //output

        for(int i = 0; i < human; i++) {
        	bw.write("-------" + name[i] + " ����ǥ-------\n");
    		bw.write("�����");
        	for(int j = 0; j < subject[i].length; j++) {
        		bw.write("\t" + subject[i][j]);
        	}
        	bw.newLine();
        	for(int j = 0; j < score[i].length; j++) {
        		bw.write("\t" + score[i][j]);
        	}
        	bw.newLine();
            bw.write("����\t���\t���\t����\n");
        	bw.write("\t" + score[i][score[i].length - 1] + "\t" + avg[i] + "\t" + grade[i] + "\t" + rank[i]);
        	bw.newLine();
        	bw.newLine();
        }
        
        bw.close();
        br.close();
    }

    public static String cg(int n) {
        String grade_list = "FFFFFFDCBAA";
    	return grade_list.substring(n / 10, n / 10);
    }
}
