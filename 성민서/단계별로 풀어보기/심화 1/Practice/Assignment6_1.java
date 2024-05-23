import java.util.*;
public class Assignment6_1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] arr = new int[6];
		for(int i=0;i<6;i++) {
			arr[i]=input.nextInt();
		}
		LinearEquation v = new LinearEquation(arr);
		if(v.isSolvable()==true) {
			System.out.println("X is " + v.getX());
			System.out.println("Y is " + v.getY());
		}
		else System.out.println("The equation has no solution");
	}
}

class LinearEquation{
	private int a,b,c,d,e,f;
	public LinearEquation(int[] ghtjfk) {
		this.a=ghtjfk[0]; this.b=ghtjfk[1]; this.c=ghtjfk[2];
		this.d=ghtjfk[3]; this.e=ghtjfk[4]; this.f=ghtjfk[5];
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public int getD() {
		return d;
	}
	public int getE() {
		return e;
	}
	public int getF() {
		return f;
	}
	public boolean isSolvable() {
		if((a*d-b*c)!=0) return true;
		else return false;
	}
	public float getX() {
		float num=(e*d-b*f);
		float den=(a*d-b*c);
		return num/den;
	}
	public float getY() {
		float num=(a*f-e*c);
		float den=(a*d-b*c);
		return num/den;
	}
}