package com.pk.tutorial.string;

//https://leetcode.com/problems/add-binary/
public class AddBinary {
	public static void main(String[] args) {
		System.out.println(addBinary("1010", "1011"));
	}

	public static String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();
		int i = a.length() - 1;
		int j = b.length() - 1;
		int acc = 0;
		while (i >= 0 || j >= 0 || acc != 0) {
			int add = charToInt(a, i) + charToInt(b, j) + acc;
			acc = 0;
			if (add >= 2) {
				result.insert(0, (add - 2));
				acc = 1;
			} else {
				result.insert(0, add);
			}
			i--;
			j--;
		}
		return result.toString();

	}

	private static Integer charToInt(String a, int c) {
		if (c < 0)
			return 0;
		return Character.getNumericValue(a.charAt(c));
	}
}
