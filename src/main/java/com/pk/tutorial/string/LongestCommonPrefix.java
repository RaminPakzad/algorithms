package com.pk.tutorial.string;

// https://leetcode.com/problems/longest-common-prefix
public class LongestCommonPrefix {
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
		System.out.println(longestCommonPrefix(new String[]{"a"}));
		System.out.println(longestCommonPrefix(new String[]{}));
	}

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		String prefix = "";
		for (int i = 0; i <= strs[0].length(); i++) {
			int counter = 0;
			for (int j = 0; j < strs.length; j++) {
				if (strs[j].length() >= i && strs[j].substring(0, i).equals(strs[0].substring(0, i)))
					counter++;
			}
			if (counter == strs.length)
				prefix = strs[0].substring(0, i);
			else
				return prefix;
		}
		return prefix;
	}
}
