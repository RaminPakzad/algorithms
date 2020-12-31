package com.pk.tutorial.hackerRank.warmup;

// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class JumpingOnClouds {
	public static void main(String[] args) {
		System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0}));
	}

	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		int i = 0;
		while (i < c.length - 1) {
			if ((i + 2) != c.length && c[i + 2] == 0)
				i = i + 2;
			else
				i++;
			jumps++;
		}
		return jumps;
	}
}
