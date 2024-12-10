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
			cio.wnl("����");
		}
		else {
			cio.wnl(this.work + "�Դϴ�.");
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
		cio.w(date + "���� ������ ");
		da[date - 1].show();
		cio.f();
	}
	
	public void finish() {
		cio.wnlf("���α׷��� �����մϴ�.");
	}
	
	public void run() {
		A:
		while(true) {
			cio.wnl("�̹��� ������ ���� ���α׷�");
			cio.wf("����(�Է�:1, ����:2, ������:3) >> ");
			String me = cio.rl();
			
			if(me.equals("3")) {
				finish();
				break A;
			}

			//��¥ ���� �˻� �߰��ص� ��
			cio.wf("��¥ �Է� : ");
			int id = cio.rli();
			
			switch (me) {
			case "1":
				cio.wf("���� �Է� : ");
				String sw = cio.rl();
				input(id, sw);
				break;
			case "2":
				view(id);
				break;
			default:
				cio.wnlf("��ȿ���� ���� �Է��Դϴ�.");
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		MonthSchedule ms = new MonthSchedule();
		ms.run();		
	}

}
