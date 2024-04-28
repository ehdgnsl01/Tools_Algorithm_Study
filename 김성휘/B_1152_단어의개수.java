package Baek_Joon_새싹;

import java.util.Scanner;
import java.util.StringTokenizer;

public class B_1152_단어의개수 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String S = input.nextLine();
		input.close();
		
		StringTokenizer st = new StringTokenizer(S, " ");
		
		System.out.println(st.countTokens());
	}

}
