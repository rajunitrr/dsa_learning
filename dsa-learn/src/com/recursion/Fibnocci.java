package com.recursion;

public class Fibnocci {

	public static void main(String[] args) {

		int n = 5;
		long startTime = System.currentTimeMillis();
		System.out.println("fib of " + n + " is " + fib(n));
		long duration = System.currentTimeMillis() - startTime;

		System.out.println("Duration of program execution " + duration);
	}

	private static int fib(int n) {

		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

}
