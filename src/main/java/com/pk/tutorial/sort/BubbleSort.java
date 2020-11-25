package com.pk.tutorial.sort;

import java.util.Arrays;

//Bubble sort has a worst-case and average complexity of О(n2)
public class BubbleSort {
	public static void main(String[] args) {
		int[] unsortedArray = {5, 2, 6, 1, 9, 3, 8};
		bubbleSort2(unsortedArray);
		Arrays.stream(unsortedArray).asLongStream().forEach(System.out::println);
	}

	private static void bubbleSort1(int[] unsortedArray) {
		for (int i = 1; i < unsortedArray.length; i++) {
			for (int j = 0; j < unsortedArray.length - i; j++) {
				if (unsortedArray[j] > unsortedArray[j + 1])
					swap(unsortedArray, j, j + 1);
			}
		}
	}

	private static void bubbleSort2(int[] unsortedArray) {
		boolean swapOccurred = true;
		int i = 0;
		while (swapOccurred) {
			i++;
			swapOccurred = false;
			for (int j = 0; j < unsortedArray.length - i; j++) {
				if (unsortedArray[j] > unsortedArray[j + 1]) {
					swap(unsortedArray, j, j + 1);
					swapOccurred = true;
				}
			}
		}
	}

	private static void swap(int[] array, int j, int k) {
		int temp = array[j];
		array[j] = array[k];
		array[k] = temp;
	}
}
