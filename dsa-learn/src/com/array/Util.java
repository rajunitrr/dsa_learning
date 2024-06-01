package com.array;

public class Util {

	public static void display(int a[]) {

		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void swap(int a, int b,int []arr) {

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static int max(int a,int b) {
		return a>b?a:b;
	}
	public static int min(int a,int b) {
		return a<b?a:b;
	}
	
}
