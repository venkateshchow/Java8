package com.java8.lambda.interfaces;

public class MyRunnableRef implements Runnable {

	@Override
	public void run() {

		for(int i = 0; i<=10;i++) {
			System.out.println("Child Thread");
		}
	}

}
