package com.anmol.sleep;

class RunnableThread implements Runnable {
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			if(i%10 == 0) {
				System.out.println("Counting reached " + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class PrintNumbers {
	public static void main(String[] args) {
		RunnableThread rt = new RunnableThread();
		Thread t = new Thread(rt);
		t.start();
	}
}
