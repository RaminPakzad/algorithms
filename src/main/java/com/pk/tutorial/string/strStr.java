package com.pk.tutorial.string;

//https://leetcode.com/problems/implement-strstr/
public class strStr {
	public static void main(String[] args) {
		System.out.println(strStr("hello", "ll"));
	}
	public static int strStr(String haystack, String needle) {
		if (haystack.trim().isEmpty() && needle.trim().isEmpty())
			return 0;
		if (!haystack.contains(needle))
			return -1;
		return haystack.indexOf(needle);
	}
}
