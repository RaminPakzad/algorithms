package com.pk.tutorial.hackerRank.warmup;

public class CountingValleys {
	public static void main(String[] args) {
		System.out.println(countingValleys(8, "UDDDUDUU"));
	}

	public static int countingValleys(int steps, String path) {
		int count = 0;
		int result = 0;

		for (int i = 0; i < steps; i++) {
			if (path.charAt(i) == 'D') {
				count++;
			} else
				count--;
			if (count == 0)
				result++;
		}
		return result;

	}
}
