package com.flowcontrols;

public class Assign15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("2\t");
		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
				if (j == i - 1) {
					System.out.print(i + "\t");
				}
			}

		}
	}

}
