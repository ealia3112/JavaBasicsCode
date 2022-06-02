package com.syntax.class07;

public class task {

	public static void main(String[] args) {
		int a = 20;
		while (a <= 100) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}
		System.out.println();
		int b = 100;
		while (b >= 1) {
			if (b % 2 != 0) {
				System.out.print(b + " ");
			}
			b--;
		}

	}

}
