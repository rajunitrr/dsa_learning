package com.sorting;

public class BubbleSort {

	private static void sort(int a[]) {

		for (int i = 0; i < a.length; i++) {
			boolean isAlreadySorted = true;
			for (int j = 0; j < a.length - i - 1; j++) {

				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					isAlreadySorted = false;
				}
			}
			display(a);
			if (isAlreadySorted) {
				System.out.println("Array is Already sorted ");
				break;
			}
		}
	}

	private static void display(int[] a) {

		for (int i : a) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 5,3, 4, 5 };
		display(a);
		sort(a);
		display(a);

	}

}
