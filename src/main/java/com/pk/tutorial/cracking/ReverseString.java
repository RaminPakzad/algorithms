package com.pk.tutorial.cracking;

// revers string
public class ReverseString {
	public static void main(String[] args) {
		System.out.println(revers("Johnx"));
	}

	public static String revers(String input) {
		int i = 0;
		int j = input.length() - 1;
		char[] arr = input.toCharArray();
		while (i < j) {
			char tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;
		}
		return String.valueOf(arr);
	}
}
