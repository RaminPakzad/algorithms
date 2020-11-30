package com.pk.tutorial.cracking;

//compress string by its repetitive chars
public class CompressString {
	public static void main(String[] args) {
		System.out.println(compress("aaaabbbbc"));//a3b4c1
	}

	public static String compress(String s) {
		StringBuilder result = new StringBuilder();
		int sum = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				result.append(s.charAt(i));
				result.append(sum);
				sum = 1;
			} else
				sum++;
		}
		result.append(s.charAt(s.length() - 1));
		result.append(sum);
		return result.toString();
	}
}
