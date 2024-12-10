package org.example;

import java.io.*;

public class temp1 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 5; i++) {
            bw.write((5 - i) + " ");
        }
        bw.flush();

        bw.close();
        br.close();
    }
}