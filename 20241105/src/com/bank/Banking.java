package com.bank;

import java.io.IOException;
import buf.cio;

public class Banking {

	public static void main(String[] args) throws IOException {
		Account na = new Account("���浿");
		String strWork;
		
		A:
		do {
			//cio.w("�۾� ������ �����Ͻʽÿ�.\n");
			cio.w("====================\n");
			cio.w("1.     ��  ��       \n");
			cio.w("2.     ��  ��       \n");
			cio.w("3.   �� �� �� ȸ    \n");
			cio.w("0.     ��  ��       \n");
			cio.w("====================\n");
			cio.w("�޴� ���� : ");
			cio.f();
			strWork = cio.rl();
			//menu_num = Integer.parseInt(cio.rl());

			cio.nl();
			cio.f();
			switch (strWork) {
			case "1":
				//cio.w("====================\n");
				cio.w("�Ա��� �ݾ� �Է� : ");
				cio.f();
				long depositLong = Long.parseLong(cio.rl());
				na.deposit(depositLong);
				break;
			case "2":
				//cio.w("====================\n");
				cio.w("����� �ݾ� �Է� : ");
				cio.f();
				long withdrawLong = Long.parseLong(cio.rl());
				na.withdraw(withdrawLong);
				break;
			case "3":
				//cio.w("====================\n");
				cio.w("�ܾ� : " + na.getBalance() + "��\n");
				cio.f();
				break;
			case "0":
				cio.w("�����մϴ�.\n");
				cio.f();
				break A;
			default:
				cio.w("�߸��� �Է��Դϴ�.\n");
				cio.w("0~3 ������ ���ڸ� �����մϴ�.\n");
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
