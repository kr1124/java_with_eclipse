package com.bank;

import java.io.IOException;

import buf.cio;

public class Account {
	private String name;
	private long balance;

	public Account() {}
	public Account(String name) {this.name = name;}
	
	public String getName() {
		return name;
	}
	public long getBalance() {
		return balance;
	}
	
	public void deposit(long amount) {
		this.balance += amount;
	}
	public boolean withdraw(long amount) throws IOException {
		if(this.balance < amount) {
			cio.w("잔액이 부족합니다.\n");
			cio.f();
			return false;
		}

		this.balance -= amount;
		return true;
	}
	
}
