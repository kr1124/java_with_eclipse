package com.vscore;

import buf.cio;

public class ScoreMain {
	public static void main(String[] args) {
		char ch = '0';
		Score score = new ScoreImpl();
		
		while(true) {
			do {
				cio.wf("1.�߰� 2.���� 3.���� 4.��ü��� 5.�й��˻� 6.�̸��˻� 7.���� : ");
				ch = (char)(cio.r());
			} while (ch < '1' || ch > '7');
			
			switch (ch) {
			case '1':
				score.insert();
				break;
			case '2':
				score.update();
				break;
			case '3':
				score.delete();
				break;
			case '4':
				score.listAll();
				break;
			case '5':
				score.searchCode();
				break;
			case '6':
				score.searchName();
				break;
			case '7':
				cio.wnlf("�����մϴ�.");
				break;
			default:
				cio.wnlf("�߸��� �Է��Դϴ�.");
				break;
			}
		}
	}
}
