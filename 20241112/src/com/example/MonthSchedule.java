package com.example;

import buf.cio;

class Day {
	private String work;

	public Day() {
	}

	public Day(String w) {
		work = w;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	public void show() {
		if(work == null) {
			cio.wnl("없음");
		}
		else {
			cio.wnl(this.work + "입니다.");
		}
	}
}

public class MonthSchedule {
	
	Day[] da = new Day[30];
	
	public MonthSchedule() {
		for (int i = 0; i < da.length; i++) {
			da[i] = new Day();
		}
	}
	
	public void input(int date, String work) {
		da[date - 1].setWork(work);
	}
	
	public void view(int date) {
		cio.w(date + "일의 할일은 ");
		da[date - 1].show();
		cio.f();
	}
	
	public void finish() {
		cio.wnlf("프로그램을 종료합니다.");
	}
	
	public void run() {
		A:
		while(true) {
			cio.wnl("이번달 스케쥴 관리 프로그램");
			cio.wf("할일(입력:1, 보기:2, 끝내기:3) >> ");
			String me = cio.rl();
			
			if(me.equals("3")) {
				finish();
				break A;
			}

			//날짜 범위 검사 추가해도 됨
			cio.wf("날짜 입력 : ");
			int id = cio.rli();
			
			switch (me) {
			case "1":
				cio.wf("할일 입력 : ");
				String sw = cio.rl();
				input(id, sw);
				break;
			case "2":
				view(id);
				break;
			default:
				cio.wnlf("유효하지 않은 입력입니다.");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		MonthSchedule ms = new MonthSchedule();
		ms.run();		
	}

}
