package com.exer;

import buf.cio;

public class ConcertApp {

    Concert ca;
    
    public ConcertApp() {
        ca = new Concert(1);
    }

    public static void main(String[] args) {
        ConcertApp cr = new ConcertApp();

        cio.wnl("글로벌 인 콘서트 프로그램");
        A:
        while(true) {
            cio.wf("예약:1, 조회:2, 취소:3, 종료:4  => ");
            String me = cio.rl();

            String seat_grade = "";
            String name = "";
            int seat_code = -1;
            switch (me) {
                case "1":
                    cio.wf("좌석구분 S, A, B => ");
                    seat_grade = cio.rl();

                    if(!(seat_grade.equals("S") || seat_grade.equals("A") || seat_grade.equals("B"))) {
                        cio.wnlf("유효한 좌석 등급이 아닙니다.");
                        continue;
                    }
                    cio.w(cr.ca.get_seats_states(seat_grade));

                    StringBuilder sb = new StringBuilder();
                    for (int i = 1; i < 11; i++) {
                        sb.append("       ").append(i);
                    }
                    cio.wnlf(sb.toString());

                    cio.wf("이름 : ");
                    name = cio.rl();
                    if(name.isEmpty()) {
                        cio.wnlf("빈 이름은 사용할 수 없습니다.");
                        continue;
                    }

                    cio.wf("번호 : ");
                    seat_code = cio.rli();
                    if(seat_code < 1 || seat_code > 10) {
                        cio.wnlf("유효한 좌석 번호가 아닙니다.");
                        continue;
                    }

                    cio.wnlf(cr.ca.reserve(seat_grade, name, seat_code - 1));
                    break;
                case "2":
                    cio.wnlf(cr.ca.search());
                    break;
                case "3":
                    cio.wnlf(cr.ca.search());

                    cio.wf("이름 : ");
                    name = cio.rl();
                    if(name.isEmpty()) {
                        cio.wnlf("빈 이름은 사용할 수 없습니다.");
                        continue;
                    }

                    cio.wnlf(cr.ca.cancel(name));
                    break;
                case "4":
                    cio.wnlf("프로그램을 종료합니다.");
                    break A;
                default:
                    cio.wnlf("유효하지 않은 입력입니다.");
                    break;
            }

            cio.nlf();
        }
    }
}
