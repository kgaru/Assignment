package com.flowcontrols;

public class PatternAssign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 6; i++) {
			for (int j = 1; j < 5; j++) {
				if (i + j <= 4) {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}
}