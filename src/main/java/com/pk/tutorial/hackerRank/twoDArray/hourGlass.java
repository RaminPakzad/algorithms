package com.pk.tutorial.hackerRank.twoDArray;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class hourGlass {

	private static final Scanner scanner = new Scanner(System.in);
//	private static final Scanner scanner = new Scanner(new FileReader());

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}

	public static int hourglassSum(int[][] arr) {
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i < 4 && j < 4) {
					int sumOfHourGlass = getSumOfHourGlass(arr, i, j);
					if (sumOfHourGlass > result) {
						result = sumOfHourGlass;
					}
				}
			}
		}
		return result;
	}

	public static int getSumOfHourGlass(int[][] array, int x, int y) {
		int result = 0;
		for (int i = x; i < x + 3; i++) {
			for (int j = y; j < y + 3; j++) {
				if (!(j != y + 1 && i == x + 1))
					result += array[i][j];
			}
		}
		return result;
	}

}
