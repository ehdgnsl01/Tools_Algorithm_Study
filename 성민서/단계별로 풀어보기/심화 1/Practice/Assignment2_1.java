import java.util.*;
public class Assignment2_1 {
	public static void main(String[] args) {
		System.out.print("Enter an integer between 0 and 1000: ");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int a=0;
		int b=0;
		int c=0;
		
		System.out.print("The multiplication of all digits in " + num + " is ");
		if(num==1000) System.out.println(0);
		else if(num>=100 && num<=999) {
			a=num/100;
			b=(num%100)/10;
			c=num%10;
			System.out.println(a*b*c);
		}
		else if(num>=10 && num<=99) {
			a=num/10;
			b=num%10;
			System.out.println(a*b);
		}
		else System.out.println(num);
	}
}