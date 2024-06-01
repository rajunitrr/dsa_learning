package com.array;

public class MaxSubArray {

	public static void main(String[] args) {

		int a[] = { -3, 8, -2, 4, -5, 6 };

		int res = a[0];
		int maxSofar = a[0];

		for (int i = 1; i < a.length; i++) {

			maxSofar = Util.max(a[i] + maxSofar, a[i]);
			res = Util.max(res, maxSofar);
		}
		System.out.println("res " + res);
	}

}
