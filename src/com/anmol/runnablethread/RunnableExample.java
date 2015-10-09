package com.anmol.runnablethread;

public class RunnableExample {
	public static void main(String args[]) throws InterruptedException {
		Thread thread1 = new Thread(new RunnableThread(), "thread1");
		Thread thread2 = new Thread(new RunnableThread(), "thread2");
		//RunnableThread thread3 = new RunnableThread("thread3");
		//Start the threads
		thread1.join();
		thread1.start();
		System.out.println("Current sleeping thread : " + Thread.currentThread().getName());
		thread2.start();
		try {
			System.out.println("Current sleeping thread : " + Thread.currentThread().getName());
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}
		//Display info about the main thread
		System.out.println(Thread.currentThread());
	}
}
