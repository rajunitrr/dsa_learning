package com.java8;

interface Istatic {

	public static void i1() {
		System.out.println("in i1()");
	}

	public default void d() {

		System.out.println("default");
	}
}

class StaticDemo implements Istatic {
	@Override
	public void d() {
		System.out.println("child default");
	}

}

public class StaticMethodDemo {

	public static void main(String[] args) {

		Istatic s = new StaticDemo();
		s.d();
		Istatic.i1();
	}

}
