package com.array;

public class TransposeMatrix {

	public static void main(String[] args) {

		int count = 1;
		int a[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = count++;
			}
		}

		display(a);
		transpose(a);

	}

	static void display(int[][] a) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	static void transpose(int[][] a) {

		System.out.println("Transpose Matrix ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j)
					System.out.print(a[i][j] + " ");
			}
		}

	}

}
