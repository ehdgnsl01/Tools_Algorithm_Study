import java.util.*;
public class Assignment4_1 {
	public static void main(String[]args) {	
		Scanner input=new Scanner(System.in);
		
		int number;
		number=input.nextInt();
		System.out.println(isPalindrome(number));
	}
	
	public static int reverse(int number) {
		String str=number+"";
		char[] strr=str.toCharArray();
		int n=str.length();
		int l=n-1;
		char temp;
		int f=0;
		for(int i=0;i<n/2;i++) {
			temp=strr[f];
			strr[f]=strr[l];
			strr[l]=temp;
			f++;
			l--;
		}
		str=new String(strr);
		int strrr=Integer.parseInt(str);
		return strrr;
	}
	
	public static boolean isPalindrome(int number) {
		return (number==reverse(number));
	}
}
