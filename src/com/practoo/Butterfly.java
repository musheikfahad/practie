package com.practoo;

public class Butterfly {
	public static void main(String args[]) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int length = a.length - 1;

		for (int i = length / 2; i >= 0; i--) {

			System.out.println(a[i]);
		}

		for (int i = length; i >length/2; i--) {
			System.out.println(a[i]);
		}
	}
}
