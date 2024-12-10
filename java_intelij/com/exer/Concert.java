package com.exer;

public class Concert {
    private int date;
    private Seat[] seats = new Seat[3];

    public Concert(int date) {
        this.date = date;
        seats[0] = new Seat("S");
        seats[1] = new Seat("A");
        seats[2] = new Seat("B");
    }

    public int sc(String seat_grade) {
        switch (seat_grade) {
            case "S":
                return 0;
            case "A":
                return 1;
            case "B":
                return 2;
            default:
                return -1;
        }
    }

    public String get_seats_states(String seat_grade) {
        StringBuilder r = new StringBuilder();
        r.append(seat_grade);
        r.append(" :");

        for (String s : seats[sc(seat_grade)].getState()) {
            r.append("\t");
            r.append(s);
        }
        r.append("\n");

        return r.toString();
    }

    public String reserve(String seat_grade, String name, int seat_code)  { //예약 함수
        for (Seat seat : seats) {
            if (seat.hasName(name) != -1) {
                return "이미 다른 좌석에 예약이 되어 있는 이름입니다.";
            }
        }

        int tg = sc(seat_grade);
        if(seats[tg].isOccupied(seat_code)) {
            return "해당 좌석은 이미 예약이 되어 있습니다.";
        }

        seats[tg].reserve(name, seat_code);
        return seat_grade + "석 " + (seat_code + 1) + "번 자리에 " + name +  " 예약 되었습니다.";
    }

    public String search() { //조회 함수
        return get_seats_states("S") +get_seats_states("A") +get_seats_states("B") + ">>>>>>>>>>  조회를 완료 하였습니다.    <<<<<<<<<<<<";
    }

    public String cancel(String name) { //예약 취소 함수
        for (int i = 0; i < seats.length; i++) {
            int sc = seats[i].hasName(name);
            if (sc != -1) {
                seats[i].cancel(sc);
                return "예약 취소 되었습니다.";
            }
        }

        return "해당 이름으로 된 예약이 존재하지 않습니다.";
    }
}
