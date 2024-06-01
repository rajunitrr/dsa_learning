package com.sorting;

public class InsertionSort {

	private static void sort(int a[]) {

		for (int i = 1; i < a.length; i++) {

			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}

			a[j + 1] = key;

		}
	}

	private static void display(int[] a) {

		for (int i : a) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 5, 1, 2, 5, 3, 4 };
		display(a);
		sort(a);
		display(a);

	}

}
