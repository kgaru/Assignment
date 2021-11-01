
public class Swapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno = 100;
		int sno = 200;
		System.out.println("Before Swapping :");
		System.out.println("Fno = " + fno + "	Sno = " + sno);

		// Creating temporary variable to swap the numbers
		int temp;
		temp = fno;
		fno = sno;
		sno = temp;
		
		System.out.println("After Swapping :");
		System.out.println("Fno : " + fno + "	Sno:	" + sno);
	}
}
