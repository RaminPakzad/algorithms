package com.pk.tutorial.hackerRank.warmup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewYearChaos {
	private static final String TOO_CHAOTIC = "Too chaotic";

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		int count = 0;
		for (int i = q.length - 1; i >= 0; i--) {
			int actualValue = i + 1;
			if (q[i] != actualValue) {
				if (q[i - 1] == actualValue) {
					count++;
					swap(q, i, i - 1);
				} else if (q[i - 2] == actualValue) {
					count += 2;
					swap(q, i - 2, i - 1);
					swap(q, i - 1, i);
				} else
					System.out.println(TOO_CHAOTIC);
					return;
			}
		}
		System.out.println(count);
	}

	static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

//    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream(new File("/Users/ramin.pakzadmanesh/Desktop/_temp/input00.txt")));

		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}

			minimumBribes(q);
		}

		scanner.close();
	}
}