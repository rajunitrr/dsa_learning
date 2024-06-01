package com.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunDemo {

	public static void main(String[] args) {

		Predicate<Integer> p = n -> n > 10;
		System.out.println(p.test(20));

		Function<String, String> f = s -> s.toUpperCase();
		System.out.println(f.apply("raju"));

	}

}
