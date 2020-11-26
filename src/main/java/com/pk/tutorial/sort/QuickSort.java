package com.pk.tutorial.sort;

import java.util.Arrays;

// an efficient sorting algorithm
// divide-and-conquer algorithm
// recursive
// O(n log n)
public class QuickSort {
	public static void main(String[] args) {
		int[] numbers = {5, 2, 6, 1, 9, 3, 8};
		quickSort(numbers, 0, numbers.length - 1);
		printArray(numbers);
	}

	public static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			//printArray(array);
			int partitionIndex = partition(array, low, high);
			quickSort(array, low, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, high);
		}
	}

	private static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, high);
		return i + 1;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void printArray(int[] numbers) {
		Arrays.stream(numbers).asLongStream().forEach(value -> System.out.print(value + " "));
		System.out.println();
	}
}
