package com.array;

public class RotateArray {

	private static void reverse(int a[], int start, int end) {

		/*
		 * while(start<end) { int temp = a[start]; a[start] =a[end]; a[end] =temp;
		 * start++; end--; }
		 */

		int n= end-start;
		for (int i = 0; i <= (n/ 2); i++) {

			int temp = a[i+start];
			a[i+start] = a[end - i];
			a[end - i] = temp;
		}
	}

	private static void displayArray(int a[]) {

		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		displayArray(a);
		reverse(a, 0, 4);
		displayArray(a);
		reverse(a, 0, 1);
		displayArray(a);
		reverse(a, 2, 4);
		displayArray(a);

	}
}
