package com.java8;

interface IMR {
	int m(int a, int b);
}

class A {
	public int m1(int a, int b) {
		return a + b;
	}

	public int m2(int a, int b) {
		return a + b;
	}
}

public class MethodRefDemo {

	public static void main(String[] args) {

		A a = new A();
		IMR i = a::m1;
		int m = i.m(10, 30);
		System.out.println("Total Sum " + m);

	}

}
