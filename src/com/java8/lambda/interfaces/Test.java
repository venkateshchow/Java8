package com.java8.lambda.interfaces;

public class Test {

	public static void main(String[] args) {
		// Regular way of creating a thread

		MyRunnableRef r = new MyRunnableRef();
		Thread t = new Thread(r);
		t.start();

		// Lambda way of creating a thread

		Runnable r1 = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("MainChild Thread");
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
