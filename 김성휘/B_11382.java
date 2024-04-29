package 제출O;

import java.util.Scanner;

public class B_11382 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 문제 조건이 10^12 이므로 int 말고 long을 사용해야 함
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		long c = scanner.nextLong();
		
		System.out.print(a + b + c);
		
		scanner.close();
	}

}
