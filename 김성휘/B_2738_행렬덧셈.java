package Baek_Joon_새싹;

import java.util.Scanner;

public class B_2738_행렬덧셈 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//  N*M 행렬
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		// 행렬 A, B
		int A_arr[] = new int[N*M];
		for(int i =0; i < N*M; i++) {
			
			A_arr[i] = scanner.nextInt();
		}
		
		int B_arr[] = new int[N*M];
		for(int i = 0; i < N*M; i++) {
			
			B_arr[i] = scanner.nextInt();
		}
		
		// 출력할 행렬 C
		int C_arr[] = new int[N*M];
		for(int i = 0; i < N*M; i++) {
			
			C_arr[i] = A_arr[i] + B_arr[i];
		}
		// 출력
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < M; j++) {
				
				System.out.print(C_arr[i*M + j] + " ");
			}
			System.out.println("");
		}
		
		scanner.close();
	}
	
}
