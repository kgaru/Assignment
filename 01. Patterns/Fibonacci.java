package com.flowcontrols;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// to get input from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Fibonacci Series: ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c;
		for (int i = 0; i < n; i++) {
			System.out.print(a + "\t");
			c = a + b;
			a = b;
			b = c;
		}

	}

}
