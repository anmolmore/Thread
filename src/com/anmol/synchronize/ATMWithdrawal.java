package com.anmol.synchronize;

public class ATMWithdrawal implements Runnable {
	Account a = new Account();
	
	public void run() {
		for(int i=0; i<5; i++) {
			makeWithdrawal();
		}
	}
	
	public boolean hasEnoughBalance() {
		if(a.getBalance() > 0)
			return true;
		else
			return false;
	}
	
	public synchronized void makeWithdrawal() {
		if(hasEnoughBalance()) {
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a.withdraw(10);
			System.out.println("Rs 10 withdrawn by " + Thread.currentThread().getName());
			System.out.println("Balance for " + Thread.currentThread().getName() + " is " + a.getBalance());
		}
		else {
			System.out.println("Not Enough, Balance for " + Thread.currentThread().getName() + " is " + a.getBalance());
			//System.out.println("Not enough balance to withdraw for " + Thread.currentThread().getName());
		}
	}
}
