package com.array;

public class StockBuy {

	static int maxProfit(int a[]) {
		int profit = 0;

		for (int i = 1; i < a.length; i++) {

			if (a[i] > a[i - 1]) {
				profit += a[i] - a[i - 1];
			}
		}

		return profit;
	}

	public static void main(String[] args) {

		int a[] = { 1, 5, 3, 8, 12 };
		
		System.out.println("Max Profit is "+maxProfit(a));

	}

}
