package 제출O;

import java.util.Scanner;

public class B_2420 {
	public static void main(String[] args) {
		
		// 사파리월드
		Scanner scanner = new Scanner(System.in);
		
		// 입력 받기 -> 입력 결과가 int 범위를 넘어가므로 long을 사용해야 함
		long N = scanner.nextLong();
		long M = scanner.nextLong();
		
		// 유명도 차이, 절댓값
		long fam = N - M;
		long fam_abs = Math.abs(fam);
		
		System.out.print(fam_abs);
		
		scanner.close();
	}

}
