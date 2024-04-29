package 제출O;

import java.util.Scanner;

public class B_1008 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// float은 오차 없이 7자리, double은 15자리
		// 문제 조건에서 오차가 10^(-9)이하.
		//소수 9번째 자리까지 출력해야하므로 double을 이용해야 함
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		System.out.print(a / b);
		
		scanner.close();
	}

}
