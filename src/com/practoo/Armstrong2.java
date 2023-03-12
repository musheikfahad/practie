package com.practoo;

public class Armstrong2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i++) {
			
			int n =i;
			int j = 0;
			int x = 0;
			while (n > 0) {
				j = n % 10;
				x = x + j * j * j;
				n = n / 10;

			}
//			System.out.println(x);
			if (x == i) {
				System.out.println(x + " armstromg number");

			}}
	}

}
