
public class SwapDemo4WO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fno = 100;
		int sno = 200;
		int tno = 300;
		int fono = 400;

		System.out.println("before swapping");
		System.out.println("fno+" + fno + "sno+" + sno + "tno+" + tno + "fono+" + fono);

		fno = fno + sno + tno + fono;
		// fno=100+200+300+400=1000
		sno = fno - (sno + tno + fono); // sno=1000-900=100
		tno = fno - (sno + tno + fono); // tno=1000-800=200
		fono = fno - (sno + tno + fono); // fono=1000-700=300
		fno = fno - (sno + tno + fono); // fon=1000-600=400
		
		System.out.println("After swapping");
		System.out.println("fno+" + fno + "sno+" + sno + "tno+" + tno + "fono+" + fono);

	}

}
