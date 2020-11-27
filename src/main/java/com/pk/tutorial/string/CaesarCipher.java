package com.pk.tutorial.string;

// https://www.hackerrank.com/challenges/caesar-cipher-1/problem
public class CaesarCipher {
	public static void main(String[] args) {
		System.out.println(caesarCipher("abcdefghij-klmnopqrstuvwxyz", 3));
		System.out.println(caesarCipher2("zz-zz", 3));
		System.out.println(caesarCipher("middle-Outz", 2));
	}

	// first solution
	static String caesarCipher(String s, int k) {
		StringBuilder result = new StringBuilder();
		k %= 26;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isLetter(c) && !isLetter((char) (c + k)))
				result.append((char) (c + k - 26));
			else if (isLetter(c))
				result.append((char) (c + k));
			else
				result.append(c);
		}
		return result.toString();
	}

	// first solution
	static String caesarCipher2(String s, int k) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				char base = (Character.isUpperCase(c) ? 'A' : 'a');
				result.append((char) ((c + k - base) % 26 + base));
			} else
				result.append(c);
		}
		return result.toString();
	}


	private static boolean isLetter(char c) {
		return (c > 64 && c < 91) || (c > 96 && c < 123);
	}
}
