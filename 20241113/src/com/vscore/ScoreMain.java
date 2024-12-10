package com.vscore;

import buf.cio;

public class ScoreMain {
	public static void main(String[] args) {
		char ch = '0';
		Score score = new ScoreImpl();
		
		while(true) {
			do {
				cio.wf("1.추가 2.수정 3.삭제 4.전체출력 5.학번검색 6.이름검색 7.종료 : ");
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
				cio.wnlf("종료합니다.");
				break;
			default:
				cio.wnlf("잘못된 입력입니다.");
				break;
			}
		}
	}
}
