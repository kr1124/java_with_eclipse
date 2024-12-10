package org.example;

import buf.cio;

import java.io.IOException;

public class TV {
    private String build;
    private int product_year;
    private int inch;

    public TV() {

    }
    public TV(String b, int y, int i) {
        build = b;
        product_year = y;
        inch = i;
    }


    public static void main(String[] args) throws IOException {
        TV myTV = new TV("Lg", 2024, 32);
        cio.rl();
        System.out.println("\033[H\033[2j");

        cio.rl();
        cio.w("after");
        cio.f();

        cio.brc();
        cio.bwc();
    }

}
