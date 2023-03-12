package com.practoo;

public class DuplicatesInArray {

	public static void dupewsofnumber() {
		int a[] = { 12, 12, 32, 45, 61, 21, 65, 45, 32, 5 };
		int count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {

				if (a[i] == a[j]) {
					System.out.println(a[j]);

					count++;
				}
			}
		}
		System.out.println(count);

	}
	
	public static void dupesofstring() {
		String a[] = { "hello" , "java" ,"hello", "java"};
		int count = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i + 1; j <= a.length - 1; j++) {

				if (a[i] == a[j]) {
					System.out.println(a[j]);

					count++;
				}
			}
		}
		System.out.println(count);

	}
		
	

	public static void main(String args[]) {
dupesofstring();
	}
}
