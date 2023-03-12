package com.practoo;

public class Armstrong {
	public static void main(String[] args) {

		int m = 153;
		int n = m;
		int j = 0;
		int i = 0;
		while (n > 0) {
			j = n % 10;
			i = i + j * j * j;
			n = n / 10;

		}
		
		System.out.println(i);
		if (i == m) {
			System.out.println(i +" armstromg number");
			
		}
		else
			System.out.println("non armstrong");
	}

}
