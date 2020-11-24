package com.pk.tutorial.string;

import java.util.Scanner;


//https://www.hackerrank.com/challenges/java-substring/problem
public class Substring {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();
		StringBuilder result = new StringBuilder();
		for (int i = start; i < end; i++) {
			result.append(S.charAt(i));
		}
		System.out.println(result);
	}
}
