package com.arrayexam;

import java.io.*;

public class ArrayExam05 {
	static int rotl = 7;
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] lot = new int[45];

        //set numbers
        for (int i = 0; i < lot.length; i++) {
            lot[i] = i + 1;
        }

        //pick random numbers
        for (int i = 0; i < rotl; i++) {
            int num = (int)(Math.random() * 45);

            int temp = lot[i];
            lot[i] = lot[num];
            lot[num] = temp;
        }

        //bubble sort
        for (int i = 0; i < rotl; i++) {
            for (int j = 0; j < rotl - i - 1; j++) {
                if(lot[j] > lot[j + 1]) {
                    int temp = lot[j];
                    lot[j] = lot[j + 1];
                    lot[j + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < rotl; i++) {
            bw.write(lot[i] + " ");
        }
        bw.write("\n");

        bw.close();
        br.close();
    }
}
