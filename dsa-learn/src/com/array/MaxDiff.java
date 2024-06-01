package com.array;

public class MaxDiff {

	public static void main(String[] args) {

		int a[] = { -1,-2,-10 };
		int res = a[1] - a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {

			res = Util.max(res, a[i] - min);
			min = Util.min(min, a[i]);

		}

		System.out.println("Max Diff " + res);
	}

}
