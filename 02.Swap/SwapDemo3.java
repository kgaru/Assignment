
public class SwapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fno=100;
int sno=200;
int tno=300;
System.out.println("before swapping");
System.out.println("fno=" + fno + "sno=" + sno + "tno="+ tno);
int temp;
temp =sno;
sno=fno;
fno=tno;
tno=temp;
System.out.println("After swapping");
System.out.println("fno=" + fno + "sno=" + sno + "tno="+ tno);
	
	}

}
