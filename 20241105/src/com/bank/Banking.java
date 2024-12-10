package com.bank;

import java.io.IOException;
import buf.cio;

public class Banking {

	public static void main(String[] args) throws IOException {
		Account na = new Account("가길동");
		String strWork;
		
		A:
		do {
			//cio.w("작업 내용을 선택하십시오.\n");
			cio.w("====================\n");
			cio.w("1.     입  금       \n");
			cio.w("2.     출  금       \n");
			cio.w("3.   잔 액 조 회    \n");
			cio.w("0.     종  료       \n");
			cio.w("====================\n");
			cio.w("메뉴 선택 : ");
			cio.f();
			strWork = cio.rl();
			//menu_num = Integer.parseInt(cio.rl());

			cio.nl();
			cio.f();
			switch (strWork) {
			case "1":
				//cio.w("====================\n");
				cio.w("입금할 금액 입력 : ");
				cio.f();
				long depositLong = Long.parseLong(cio.rl());
				na.deposit(depositLong);
				break;
			case "2":
				//cio.w("====================\n");
				cio.w("출금할 금액 입력 : ");
				cio.f();
				long withdrawLong = Long.parseLong(cio.rl());
				na.withdraw(withdrawLong);
				break;
			case "3":
				//cio.w("====================\n");
				cio.w("잔액 : " + na.getBalance() + "원\n");
				cio.f();
				break;
			case "0":
				cio.w("종료합니다.\n");
				cio.f();
				break A;
			default:
				cio.w("잘못된 입력입니다.\n");
				cio.w("0~3 사이의 숫자만 가능합니다.\n");
				cio.f();
				break;
			}
			
			cio.nl();
			cio.f();
		} while(true);

		cio.brc();
		cio.bwc();
	}
}
