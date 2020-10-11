package com.java8.predicates;

import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {

		int[] x = { 0, 7, 10, 20, 30, 40, 50, 60, 70 };
		Predicate<Integer> p1 = i -> i > 20;
		Predicate<Integer> p2 = i -> i % 2 == 0;

		System.out.println("Greater than 20:");
		method1(p1, x);

		System.out.println("Even Numbers:");
		method1(p2, x);
		
		System.out.println("Not Greater than 20:");
		method1(p1.negate(), x);
		
		System.out.println("Greater than 20 and even:");
		method1(p1.and(p2), x);
		
		System.out.println("Not Greater than 20s and even:");
		method1(p1.or(p2), x);

	}

	static void method1(Predicate<Integer> p, int[] x) {
		for (int eachvalue : x) {
			if (p.test(eachvalue)) {
				System.out.println(eachvalue);
			}

		}

	}

}
