package com.classexam;

import java.io.IOException;
import buf.cio;

class Salary {
	private int pay;

	public int getPay() {
		return pay;
	}
	public void setPay(int pay, String pass) {
		if(pass.equals("1234")) {
			this.pay = pay;
		}
	}

}

public class SalaryEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Salary s = new Salary();
		s.setPay(10000, "1234");

		int mypay = s.getPay();

		cio.bww("나의 현재 잔액은 " + mypay + "입니다.");
		cio.bwc();
	}

}
