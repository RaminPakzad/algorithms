package com.pk.tutorial.string;


//https://leetcode.com/problems/buddy-strings/
public class BuddyString {
	public static void main(String[] args) {
		System.out.println(buddyStrings("abc", "acb"));
	}

	//my code
	public static boolean buddyStringsMe(String A, String B) {
		if (A.length() != B.length())
			return false;
		String[] splitA = A.split("");
		for (int i = 0; i < splitA.length; i++) {
			for (int j = i + 1; j < splitA.length; j++) {
				String[] temp = A.split("");
				temp[i] = splitA[j];
				temp[j] = splitA[i];
				if (String.join("", temp).equals(B))
					return true;
			}
		}
		return false;
	}

	//solution
	public static boolean buddyStrings(String A, String B) {
		if (A.length() != B.length()) return false;
		if (A.equals(B)) {
			int[] count = new int[26];
			for (int i = 0; i < A.length(); ++i)
				count[A.charAt(i) - 'a']++;

			for (int c : count)
				if (c > 1) return true;
			return false;
		} else {
			int first = -1, second = -1;
			for (int i = 0; i < A.length(); ++i) {
				if (A.charAt(i) != B.charAt(i)) {
					if (first == -1)
						first = i;
					else if (second == -1)
						second = i;
					else
						return false;
				}
			}

			return (second != -1 && A.charAt(first) == B.charAt(second) &&
					A.charAt(second) == B.charAt(first));
		}
	}
}

