package com.pk.tutorial.cracking;

public class PermutationString {
	public static void main(String[] args) {
		System.out.println(isPermutation("abc", "cba"));
	}

	public static boolean isPermutation(String s1, String s2) {
		int[] chars = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			chars[s1.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s2.length(); i++) {
			chars[s2.charAt(i) - 'a']--;
		}
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] > 0)
				return false;
		}
		return true;
	}
}
