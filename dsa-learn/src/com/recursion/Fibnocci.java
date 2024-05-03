package com.recursion;

public class Fibnocci {

	public static void main(String[] args) {

		int n = 5;
		System.out.println("fib of " + n + " is " + fib(n));

	}

	private static int fib(int n) {

		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

}
