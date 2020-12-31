package com.pk.tutorial.hackerRank.warmup;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class SalesByMatch {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
	}

	static int sockMerchant(int n, int[] ar) {
		if (ar.length == 0)
			return 0;
		Set<Integer> unpairSocks = new HashSet<>();
		for (int item : ar) {
			if (unpairSocks.contains(item))
				unpairSocks.remove(item);
			else
				unpairSocks.add(item);
		}
		return (n - unpairSocks.size()) / 2;
	}

//	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int n = scanner.nextInt();
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//		int[] ar = new int[n];
//
//		String[] arItems = scanner.nextLine().split(" ");
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//		for (int i = 0; i < n; i++) {
//			int arItem = Integer.parseInt(arItems[i]);
//			ar[i] = arItem;
//		}
//
//		int result = sockMerchant(n, ar);
//
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();
//
//		scanner.close();
//	}
}
