package com.pk.tutorial;

import java.util.Arrays;
import java.util.List;

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

	public static void printArray(List<Integer> arr) {
		arr.forEach(value -> System.out.print(value + " "));
		System.out.println();
	}
}
