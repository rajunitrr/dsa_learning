package com.array;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int a[] = { 0, 10, 0, 0, 20, 30, 40, 50, 0 };
		Util.display(a);
		int index = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] != 0) {
				Util.swap(index, i, a);
				index++;
			}
		}
		System.out.println(index);
		Util.display(a);

	}

}
