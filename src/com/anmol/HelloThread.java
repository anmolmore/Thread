package com.anmol;
import java.util.Date;

/**
 * Creating a thread extending Thread Class
 * @author Anmol More
 *
 */
public class HelloThread extends Thread {

	public static void main(String[] args) {
		(new HelloThread()).start();

	}
	
	@Override
	public void run() {
		System.out.println("Starting Thread" + " at " + new Date());
	}

}
