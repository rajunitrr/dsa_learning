package com.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequeniciesInSortedArray {

	public static void printFreq(int a[], int n) {
		int freq = 1, i = 1;
		while (i < n) {

			while (i < n && a[i - 1] == a[i]) {
				freq++;
				i++;
			}

			System.out.println(a[i - 1] + " freq is " + freq);
			i++;
			freq = 1;

		}

	}

	public static void printFreq(int a[]) {

		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int i : a) {

			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		map.forEach((k, v) -> System.out.println(k + " " + v));

	}

	public static void printsFreq(int[] a) {
		Map<Object, Integer> map = Arrays.stream(a).boxed()
				.collect(Collectors.toMap(k -> k, v -> 1, Integer::sum, LinkedHashMap::new));

		map.forEach((k, v) -> System.out.println(k + " " + v));
		
	}

	public static void main(String[] args) {

		int a[] = { 40, 50, 50, 50 };
		printFreq(a, a.length);// for sorted arrays.
		printFreq(a);
		printsFreq(a);

	}

}
