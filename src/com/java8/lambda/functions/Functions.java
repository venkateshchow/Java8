package com.java8.lambda.functions;

import java.util.function.Function;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, Integer> f = s-> s.length();
		System.out.println(f.apply("Venkat"));

	}

}
