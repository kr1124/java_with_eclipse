package com.arraythree;

import java.io.*;

public class ArrayEx01 {
    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int field = 2;
        int row = 3;
        int col = 4;
        
        int[][][] arr = new int[field][row][col];
        int v = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	for(int j = 0; j < arr[i].length; j++) {
        		for(int k = 0; k < arr[i][j].length; k++) {
        			arr[i][j][k] = v++; 
                	bw.write(arr[i][j][k] + "\t");
                }
        		bw.newLine();
            }
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
