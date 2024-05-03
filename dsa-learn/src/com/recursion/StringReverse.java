package com.recursion;

public class StringReverse {

	public static void main(String[] args) {

		String input = "";
		System.out.println("Reverse of a String " + input + " is::" + reverseString(input, 0));
	}

	private static String reverseString(String input, int n) {

		if (n >=input.length()) {
			return "";
		}
		return reverseString(input, n+1)+input.charAt(n);
	}

}
