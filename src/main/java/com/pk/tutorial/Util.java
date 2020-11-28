package com.pk.tutorial;

import java.util.Arrays;

public class Util {
	private Util() {
	}

	public static void printArray(int[] arr) {
		printArray(arr, "");
	}

	public static void printArray(int[] arr, String text) {
		if (!text.isEmpty())
			System.out.println(text);
		Arrays.stream(arr).asLongStream().forEach(value -> System.out.print(value + " "));
		System.out.println();
	}
}
