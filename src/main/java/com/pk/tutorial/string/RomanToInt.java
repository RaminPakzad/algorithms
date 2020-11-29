package com.pk.tutorial.string;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/roman-to-integer
public class RomanToInt {
	private static final Map<Character, Integer> VALUES = new HashMap<>();

	static {
		VALUES.put('I', 1);
		VALUES.put('V', 5);
		VALUES.put('X', 10);
		VALUES.put('L', 50);
		VALUES.put('C', 100);
		VALUES.put('D', 500);
		VALUES.put('M', 1000);
	}

	public static void main(String[] args) {
		System.out.println(romanToInt("LVIII"));
		System.out.println(romanToInt("IX"));
		System.out.println(romanToInt("IV"));
		System.out.println(romanToInt("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i != s.length() - 1 && VALUES.get(s.charAt(i)) < VALUES.get(s.charAt(i + 1))) {
				String next = VALUES.get(s.charAt(i + 1)).toString();
				result += (next.charAt(0) == '5' ? Integer.valueOf(next.replace('5', '4')) : Integer.valueOf(next.replace("10", "9")));
				i++;
			} else
				result += VALUES.get(s.charAt(i));
		}
		return result;
	}
}
