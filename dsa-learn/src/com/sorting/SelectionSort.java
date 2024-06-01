package com.sorting;

public class SelectionSort {

	private static void sort(int a[]) {

		for (int i = 0; i < a.length; i++) {
			int min_index = i;
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[min_index]) {
					min_index = j;
				}
			}

			int temp = a[min_index];
			a[min_index] = a[i];
			a[i] = temp;

		}
	}

	private static void display(int[] a) {

		for (int i : a) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 5,1, 2, 5, 3, 4, 5,5,5 };
		display(a);
		sort(a);
		display(a);

	}

}
