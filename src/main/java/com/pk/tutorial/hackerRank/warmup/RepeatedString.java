package com.pk.tutorial.hackerRank.warmup;

public class RepeatedString {
	public static void main(String[] args) {
		System.out.println(repeatedString("a", 1000000000000L));
	}

	static long repeatedString(String s, long n) {
		long countOfA = 0;
		char[] chars = s.toCharArray();
		for (char c : chars) {
			if (c == 'a')
				countOfA++;
		}
		countOfA = countOfA * (n / s.length());
		for (int i = 0; i < (n % s.length()); i++) {
			if (chars[i] == 'a')
				countOfA++;
		}
		return countOfA;
	}
}
