// WAP to print 
//1,3,5,7,9
//upto 50

package com.flowcontrols;

public class PatternAssign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 51; i++) {
			if (i % 2 != 0) {
				System.out.print(i + "\t");
			}

			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
