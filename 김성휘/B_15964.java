package 제출O;


import java.util.Scanner;

public class B_15964 {
	public static void A_B() {  // A@B 함수 선언
		
		Scanner scanner = new Scanner(System.in);
		
		// 처음에 int로 해서 30점 나옴
		// 범위를 보니 10^9 넘을 수 있으므로 long을 사용
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		
		long C = (A + B) * (A - B);
		
		System.out.print(C);
	}
	
	public static void main(String[] args) {
		
		A_B();
		
	}

}
