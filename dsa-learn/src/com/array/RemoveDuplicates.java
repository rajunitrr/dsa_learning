package com.array;

public class RemoveDuplicates {

	static int remDup(int a[], int n) {

		int rem = 1;

		for (int i = 1; i < n; i++) {

			if (a[i] != a[rem - 1]) {
				a[rem] = a[i];
				rem++;
			}
		}
		return rem;
	}

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 30, 30, 30,40 };
		Util.display(a);

		System.out.println("Find Distinct Elements "+remDup(a, a.length));
		Util.display(a);

	}

}
