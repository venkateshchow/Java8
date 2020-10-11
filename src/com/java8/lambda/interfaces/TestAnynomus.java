package com.java8.lambda.interfaces;

public class TestAnynomus {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(()->{
			for (int i = 0; i <= 10; i++) {
				System.out.println("MainChild Thread");
			}
		});
		t.start();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread");
		}
		
	}

}
