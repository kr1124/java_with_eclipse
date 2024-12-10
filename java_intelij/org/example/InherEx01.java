package org.example;

import buf.cio;

class CellPhone {
    String model;
    String number;
    int chord;

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    public int getChord() {
        return chord;
    }
}

class MP3Phone extends CellPhone {
    int size;

    public MP3Phone(String model, String num, int chord, int size) {
        this.model = model;
        this.number = num;
        this.chord = chord;
        this.size = size;
    }
}

public class InherEx01 {

    public static void main(String[] args) {


    }

}
