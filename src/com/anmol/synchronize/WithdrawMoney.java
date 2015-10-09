package com.anmol.synchronize;

public class WithdrawMoney  {
	
public static void main(String args[]) {
		
		ATMWithdrawal atm = new ATMWithdrawal();
		Thread t1 = new Thread(atm);
		t1.setName("John");
		t1.start();
		
		Thread t2 = new Thread(atm);
		t2.setName("Lucy");
		t2.start();
	}
}
