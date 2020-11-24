package com.pk.tutorial.string;

//https://www.hackerrank.com/challenges/java-string-compare/problem
public class SubstringComparisons {
	public static void main(String[] args) {
		System.out.println(getSmallestAndLargest("welcometojava", 3));
	}
	//my first solution
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		smallest = s.substring(0, k);
		largest = s.substring(0, k);
		for (int i = 1; i < s.length() - k + 1; i++) {
			String exp = s.substring(i, k + i);
			if (isSmaller(exp, smallest))
				smallest = exp;
			if (isSmaller(largest, exp))
				largest = exp;
		}


		return smallest + "\n" + largest;
	}

	public static boolean isSmaller(String first, String second) {
		if (first.length() < second.length())
			return true;
		if (first.length() > second.length())
			return false;

		for (int i = 0; i < first.length(); i++) {
			if (first.charAt(i) < second.charAt(i))
				return true;
			if (first.charAt(i) > second.charAt(i))
				return false;
		}
		return false;
	}
}
