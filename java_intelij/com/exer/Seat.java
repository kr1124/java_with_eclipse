package com.exer;

public class Seat {
    private final String seat_grade;
    private String[] state = new String[10];

    public Seat(String g) {
        this.seat_grade = g;
        for (int i = 0; i < state.length; i++) {
            state[i] = "-----";
        }
    }

    public String[] getState() {
        return state;
    }

    public int hasName(String name) {
        for (int i = 0; i < state.length; i++) {
            if(state[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void reserve(String name, int seat_code) {
        state[seat_code] = name;
    }

    public void cancel(int seat_code) {
        state[seat_code] = "-----";
    }

    public boolean isOccupied(int code) {
        if(state[code].equals("-----")) {
            return false;
        }
        else {
            return true;
        }
    }


}
