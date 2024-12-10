package org.example;

import java.io.*;

public class Exam1105 {
    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("행에 표시할 단 입력 : ");
        bw.flush();
        int width = Integer.parseInt(br.readLine());

        int k = 9;
        int starts = 2;
        while(k > 1) {
            for(int i = 1; i <= 9; i++) {
                int ends = starts + width;
                if(ends > 10) {
                    ends = 10;
                }
                for (int j = starts; j < ends; j++) {
                    bw.write(j + " * " + i + " = " + (i * j) + "\t");
                }
                bw.newLine();
            }
            bw.newLine();

            k = k - width;
            starts = starts + width;
        }

        bw.close();
        br.close();
    }
}