package com.anmol.synchronize;

public class Account {
	private int balance = 50;
	
	public int getBalance() {
		return balance;
	}

	public void withdraw(int x) {
		balance = balance - x;
	}
}
