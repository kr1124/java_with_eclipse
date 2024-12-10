package com.exam;

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

    public void show() throws IOException {
        cio.w(build + "�� " + product_year + "���� " + inch + "��ġ TV");
        cio.f();
    }

    public static void main(String[] args) throws IOException {
        TV myTV = new TV("Lg", 2024, 32);
        myTV.show();
    }

}