import java.util.*;
public class Assignment6_2 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		int[] arr = new int[8];
		for(int i=0;i<8;i++) {
			arr[i]=input.nextInt();
		}
		LinearEquation v = new LinearEquation(transform(arr) );
		if(v.isSolvable()==true) {
			System.out.println("(" + v.getX() + "," + v.getY() + ")");
		}
		else System.out.println("The equation has no solution");
	}
	
	public static int[] transform(int[] arr) {
		int x1=arr[0], y1=arr[1], x2=arr[2], y2=arr[3];
		int x3=arr[4], y3=arr[5], x4=arr[6], y4=arr[7];
		int[] ghtjfk=new int [6];
		ghtjfk[0]=(y2-y1); ghtjfk[1]=(x1-x2); ghtjfk[2]=(y4-y3);
		ghtjfk[3]=(x3-x4); ghtjfk[4]=(x1*y2-x2*y1); ghtjfk[5]=(x3*y4-x4*y3);
		return ghtjfk;
	}
}