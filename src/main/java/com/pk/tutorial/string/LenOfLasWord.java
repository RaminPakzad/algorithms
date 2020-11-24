package com.pk.tutorial.string;

//https://leetcode.com/problems/length-of-last-word/
public class LenOfLasWord {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("h "));
	}
	
	public static int lengthOfLastWord(String s) {
		s = s.trim();
		if (s.isEmpty())
			return 0;
		if (s.indexOf(' ') == -1)
			return s.length();
		return s.length() - s.lastIndexOf(' ') - 1;
	}
}
