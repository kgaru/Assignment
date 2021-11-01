//WAP to print 1 to 50
// 1 2 3 4 5
// 6 7 8 9 10
// 11 12 13 14 15
// .....upto 50

package com.flowcontrols;

public class Patternassign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 51; i++) {
			System.out.print(i + "\t");
			if (i % 5 == 0) 
			{
				System.out.println();
			}

		}
	}

}
