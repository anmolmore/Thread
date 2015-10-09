package com.anmol.runnablethread;

public class RunnableThread implements Runnable {
	
	Thread runner;
	public RunnableThread() {
		// TODO Auto-generated constructor stub
	}
	
	public RunnableThread(String threadName) {
		runner = new Thread(this, threadName);
		System.out.println("Starting thread :: " + runner.getName());
		runner.start();
	}
	@Override
	public void run() {
		System.out.println("starting Thread run info :: " + Thread.currentThread());
		//Display info about this particular thread
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ending Thread run info :: " + Thread.currentThread());
	}

}
