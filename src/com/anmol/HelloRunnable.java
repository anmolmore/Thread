package com.anmol;
import java.util.Date;


public class HelloRunnable implements Runnable{
	
	static int count = 1;

	@Override
	public void run() {
		System.out.println("Started Thread " + count + " at " + (new Date()));
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			new Thread(new HelloRunnable()).start();
			System.out.println("Ending Thread " + count + " at " + new Date());
			count++;
			System.out.println("\n");
		}
	}
}
