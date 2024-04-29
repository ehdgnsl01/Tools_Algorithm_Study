package 제출O;

import java.util.Scanner;

public class B_10871 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();  // 수열 A의 개수인 N 입력 받기
		int X = scanner.nextInt();  // 출력 기준인 X 입력 받기
		
		int A_arr[] = new int[N];  // 수열 A를 저장할 배열 선언
		
		// 수열 A 입력 받기
		for(int i = 0; i < N; i++) {
			A_arr[i] = scanner.nextInt();
		}
		

		// 수열 A에서 X보다 작은 수 순서대로 출력
		for(int i = 0; i < N; i++) {
			if(A_arr[i] < X) {
				System.out.print(A_arr[i] + " ");
			}
		}
		
		scanner.close();
	}

}
