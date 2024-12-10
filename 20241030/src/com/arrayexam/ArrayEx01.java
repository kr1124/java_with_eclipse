package com.arrayexam;

import java.io.*;

public class ArrayEx01 {
    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("학생 수 입력 : ");
        bw.flush();
        int human = Integer.parseInt(br.readLine());
        String[] name = new String[human];
        
        bw.write("과목 수 입력 : ");
        bw.flush();
        int sub = Integer.parseInt(br.readLine());
        String[] subject = new String[sub];

        int[][] score = new int[human][sub + 1];
        double[] avg = new double[human];
        char[] grade = new char[human];
        String grade_list = "FFFFFFDCBAA";
        int[] rank = new int[human];        

        for(int i = 0; i < sub; i++) {
        	bw.write((i + 1) + "번째 과목의 이름 입력 : ");
        	bw.flush();
        	subject[i] = br.readLine();
        }
        
        for(int i = 0; i < human; i++) {
        	//bw.write((i + 1) + "번째 학생의 이름 입력 : ");
        	bw.write("학생의 이름 입력 : ");
        	bw.flush();
        	name[i] = br.readLine();
        	
    		bw.write("-학생 " + name[i] + "-\n");
        	for(int j = 0; j < sub; j++) {
        		bw.write("\t" + subject[j] + " 점수 입력 : ");
            	bw.flush();
            	score[i][j] = Integer.parseInt(br.readLine());
            	
            	score[i][score[i].length - 1] += score[i][j];
        	}

        	avg[i] = score[i][score[i].length - 1] * 1.0 / sub;
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
        bw.write("이름\t");
        for(int i = 0; i < sub; i++) {
        	bw.write(subject[i] + "\t");
        }
        bw.write("총점\t평균\t등급\t석차");
        bw.newLine();
        
        for(int i = 0; i < human; i++) {
        	bw.write(name[i]);
        	for(int j = 0; j < score[i].length; j++) {
        		//bw.write("\t" + score[i][j] + "(" + cg(score[i][j]) + ")");
        		//bw.write("\t" + score[i][j] + "(" + grade_list.charAt(score[i][j] / 10) + ")");
        		bw.write("\t" + score[i][j]);
        	}
        	bw.write("\t" + avg[i] + "\t" + grade[i] + "\t" + rank[i]);
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
