//WAP given number is prime number or not

package com.flowcontrols;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int i;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("not a prime number");
				break;
			}
			if (i == n - 1) {
				System.out.println("is a prime number");
			}
		}

	}

}
