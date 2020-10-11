package com.java8.lambda;

public class Test {

	public static void main(String[] args) {

		Sum s =(x,y)-> System.out.println("Sum of digits:" +(x+y));
		s.add(10, 5);
	}

}
