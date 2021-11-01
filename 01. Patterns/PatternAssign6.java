//WAP to print
//2 4 6 8 10
//up to 100

package com.flowcontrols;

public class PatternAssign6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
			if (i % 10 == 0) {
				System.out.println();
			}
				
				
		}
	}
}
