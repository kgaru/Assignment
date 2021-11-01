
public class swapdemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno = 100;
		int sno = 200;
		int tno = 300;
		int fono = 400;
		System.out.println("before swapping");
		System.out.println("fno=" + fno + "sno=" + sno + "tno" + tno + "fono" + fono);

		int temp;
		temp = fno;
		fno = sno;
		sno = tno;
		tno = fono;
		fono = temp;

		System.out.println("After swapping");
		System.out.println("fno=" + fno + "sno=" + sno + "tno" + tno + "fono" + fono);

	}

}
