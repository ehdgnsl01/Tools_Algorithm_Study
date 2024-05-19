import java.util.*;
public class Assignment4_2 {
	public static void main(String[] args) {
		int count=0;
		int num=2;
		while (count<120) {
			if(isPrime(num) && isPrime(Assignment4_1.reverse(num)) && Assignment4_1.isPalindrome(num)==false) {
				System.out.print(num+" ");
				count++;
				if(count%10==0)System.out.println();
			}
			num++;
		}
	}
	
	public static boolean isPrime(int num) {
		for(int i=2;i<num/2;i++) {
			if(num%i==0) return false;
		}
		return true;
	}
}
