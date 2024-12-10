package org.example;

import java.io.*;

public class Exam1029 {
    static int row = 7;
    static int col = 8;
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sym = 1;

        for (int i = 0; i < row; i++) {
            double k = 0;
            double balancer = ((i * 2 + 1) * col + 1) / 2.0;
            for (int j = 1; j <= col; j++) {
                k = (i * col + j - balancer) * sym + balancer;
                bw.write((int)k + "\t");
            }
            sym *= -1;
            bw.write("\n");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}