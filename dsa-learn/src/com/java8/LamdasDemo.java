package com.java8;

@FunctionalInterface
interface f1 {
	public int add(int a, int b);
}



public class LamdasDemo {

	public static void main(String[] args) {

		f1 f2 = (a, b) -> a + b;
		System.out.println(f2.add(30, 40));

	}

}
