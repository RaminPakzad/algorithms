package com.pk.tutorial.sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {3, 1, 4, 6, 9, 7};
		insertionSort(arr);
		Arrays.stream(arr).asLongStream().forEach(value -> System.out.print(value + " "));
		System.out.println();
	}

	public static void insertionSort(int[] array) {
		for (int j = 1; j < array.length; j++) {
			int key = array[j];
			int i = j - 1;
			while (i > -1 && array[i] > key) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}
}
