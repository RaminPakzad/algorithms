package com.pk.tutorial.string;

// https://leetcode.com/problems/maximum-repeating-substring/
public class MaxRepeatingSubstring {
	public static void main(String[] args) {
		System.out.println(maxRepeating("ababc", "ab"));
	}

	public static int maxRepeating(String sequence, String word) {
		int result = 0;
		int max = 0;
		for (int i = sequence.indexOf(word); i < sequence.length(); i++) {
			if (sequence.startsWith(word, i)) {
				result++;
				i = i + word.length() - 1;
				if (result > max) {
					max = result;
				}
			} else
				result = 0;
		}
		return max;
	}
}
