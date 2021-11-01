
public class Swapdemo3w {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sno=100;
		int fno=200;
		int tno=300;
	
		System.out.println("before swapping");
		System.out.println("fno=" + fno + "sno=" + sno + "tno="+ tno);
fno=sno+fno+tno; //fno=100+200+300=600
sno=fno-(sno+tno); //sno=600-400=200
tno=fno-(sno+tno); //tno=600-200=400
fno=fno-(sno+tno); //fno=600-500=100

System.out.println("After swapping");
System.out.println("fno=" + fno + "sno=" + sno + "tno="+ tno);
	}

}
