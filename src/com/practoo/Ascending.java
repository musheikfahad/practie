package com.practoo;

import java.util.Arrays;

public class Ascending {

	public static void main(String args[]) {
		int a[] = { 21, 45, 19, 31, 13, 2, 1 };
		
		System.out.println("array before sorting "+Arrays.toString(a));
		int length = a.length;
		for (int i = 0; i < length - 1; i++) {

			for (int j = 0; j < length - 1; j++) {

				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}
		}
		
		System.out.println("array after sorting "+Arrays.toString(a));
	}
}
