import java.util.*;
public class Assignment3_2 {
	public static void main(String[] args) {
		int c_win=0, p_win=0;
		int c_num, p_num; 
		Scanner input = new Scanner(System.in);
		while(Math.abs(c_win-p_win)!=2) {
			c_num = (int)(Math.random()*3);
			if(c_num==0) {
				System.out.println("computer is scissor.");
				System.out.print("scissor (0), rock (1), paper (2): ");
				p_num = input.nextInt();
				if(p_num==0)
					System.out.println("You drew");
				else if(p_num==1) {
					System.out.println("You won");
					p_win++;
				}
				else {
					System.out.println("You lost");
					c_win++;
				}
			}
			else if(c_num==1) {
				System.out.println("computer is rock.");
				System.out.print("scissor (0), rock (1), paper (2): ");
				p_num = input.nextInt();
				if(p_num==0) {
					System.out.println("You lost");
					c_win++;
				}
				else if(p_num==1)
					System.out.println("You drew");
				else {
					System.out.println("You won");
					p_win++;
				}
			}
			else if(c_num==2) {
				System.out.println("computer is paper.");
				System.out.print("scissor (0), rock (1), paper (2): ");
				p_num = input.nextInt();
				if(p_num==0) {
					System.out.println("You won");
					p_win++;
				}
				else if(p_num==1) {
					System.out.println("You lost");
					c_win++;
				}
				else
					System.out.println("You drew");
			}
		}
		if(c_win>p_win)
			System.out.println("Computer won more than two times");
		else
			System.out.println("You won more than two times");
	}
}
