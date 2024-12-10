package com.objex;

import java.io.*;

public class MethodEx01 {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        MethodEx mm = new MethodEx();
        int n1 = 10, n2 = 20;
        int a = mm.add(n1, n2);
        int b = mm.sub(n1, n2);
        int c = mm.mul(n1, n2);
        int d = mm.div(n1, n2);
        
        //MethodEx.add2(4, 5);

        bw.write("+ => " + a + "\n");
        bw.write("- => " + b + "\n");
        bw.write("* => " + c + "\n");
        bw.write("/ => " + d + "\n");
        
        bw.close();
        br.close();
    }
}
