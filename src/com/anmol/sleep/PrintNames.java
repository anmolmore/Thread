package com.anmol.sleep;

class PrintingThread implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<4; i++) {
			System.out.println("Run by " + Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException exp) {
				exp.printStackTrace();
			}
		}
	}
}

public class PrintNames {
	public static void main(String[] args) {
		PrintingThread myThread = new PrintingThread();
		Thread t1 = new Thread(myThread);
		t1.setName("Fred");
		Thread t2 = new Thread(myThread);
		t2.setName("Lucy");
		Thread t3 = new Thread(myThread);
		t3.setName("Ricky");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
