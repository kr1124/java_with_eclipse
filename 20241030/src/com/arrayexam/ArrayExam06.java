package com.arrayexam;

import java.io.*;

public class ArrayExam06 {
    static int mleng = 10;

    public static void main(String[] args) throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] money = new int[mleng];

        bw.write("액수 입력 : ");
        bw.flush();
        int inm = Integer.parseInt(br.readLine());

        String a1 = "";
        for(int i = 0, np = 50000; i < mleng; i++) {
            money[i] = inm / np;
            inm %= np;

            a1 += np + "원권\t\t";
            if(i % 2 == 0) {
                np /= 5;
            }
            else {
                np /= 2;
            }
        }

        String a2 = "";

        for (int i = 0; i < mleng; i++) {
            a2 += money[i] + "\t\t\t\t";
        }

        bw.write(a1 + "\n" + a2);

        bw.close();
        br.close();
    }
}
