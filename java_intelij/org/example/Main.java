package org.example;

import buf.cio;

public class Main {

    public static void main(String[] args) {
        int[] chi = new int[20];

        for (int i = 0; i < chi.length; i++) {
            chi[i] = cio.r();
            //cio.rl();
            cio.wnlf(chi[i]);
        }
        cio.nlf();
        for (int i = 0; i < chi.length; i++) {
            //cio.rl();
            cio.wnlf(chi[i]);
        }




        int i1 = cio.r();


    }
}
