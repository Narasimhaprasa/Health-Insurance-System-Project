package com.nt.programs;

import java.util.Arrays;

public class ZigZagSequence {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int size = a.length;
		findZigZagSequence(a, size);

	}

	public static void findZigZagSequence(int[] a, int n) {
		Arrays.sort(a);
		int mid = (n + 1) / 2 - 1;
		//int mid = n/2;
		int temp = a[mid];
		a[mid] = a[n - 1];
		a[n - 1] = temp;

		int st = mid + 1;
		int ed = n - 2;
		while (st <= ed) {
			temp = a[st];
			a[st] = a[ed];
			a[ed] = temp;
			st = st + 1;
			ed = ed - 1;
		}
		for (int i = 0; i < n; i++) {
			if (i > 0)
				System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
