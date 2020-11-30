package com.pk.tutorial.cracking;

// Implement an algorithm to see if a string has all unique characters, without using additional data structures.
public class UniqueCharacters {
	public static void main(String[] args) {
		System.out.println(isUnique("testtt"));
	}

	public static boolean isUnique(String s) {
		int[] chars = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int charIndex = s.charAt(i) - 'a';
			if (chars[charIndex] > 1)
				return false;
			chars[charIndex]++;
		}
		return true;
	}
}
