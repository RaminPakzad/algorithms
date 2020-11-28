package com.pk.tutorial.string;

// https://www.hackerrank.com/challenges/mars-exploration/problem
public class MarsExploration {
	public static void main(String[] args) {
		System.out.println(marsExploration2("SOSSPSSQSSOR"));
	}

	static int marsExploration2(String s) {
		int result = 0;
		char[] sos = {'S', 'O', 'S'};
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) != sos[i % 3])
				result++;

		return result;
	}
}
