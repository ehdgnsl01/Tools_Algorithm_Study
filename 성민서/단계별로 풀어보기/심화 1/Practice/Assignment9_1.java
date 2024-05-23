import java.util.*;
public class Assignment9_1 {
	public static void main(String[] args) {
		Account1 acc = new Account1("George", 1122, 1000.0);
		double amount = 0;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.printf("1. Withdraw\n");
			System.out.printf("2. Deposit\n");
			System.out.printf("3. Print Transactions\n");
			System.out.printf("4. Exit\n");
			System.out.printf("input menu: ");
			int menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.printf("Input amount: ");
				amount = input.nextDouble();
				acc.withdraw(amount);
				break;
			case 2:
				System.out.printf("Input amount: ");
				amount = input.nextDouble();
				acc.deposit(amount);
				break;
			case 3:
				acc.printInformation();
				break;
			}
			System.out.println("");
			if(menu == 4)
				break;
			
		}
	}
}