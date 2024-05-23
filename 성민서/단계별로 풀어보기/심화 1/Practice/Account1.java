import java.util.*;

public class Account1 extends Account {
	private String name;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
		
	Account1(){
		super();
	}
	
	Account1(String name, int id, double balance ){
		super(id, balance);
		super.setAnnualInterestRate(1.6);
		this.name = name;
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount > getBalance())
			System.out.printf("Amount is greater then balance\n");
		else {
			transactions.add(new Transaction('W', amount, getBalance() - amount));
			setBalance(getBalance() - amount);
		}
	  }
	
	@Override
	public void deposit(double amount) {
			transactions.add(new Transaction('D', amount, getBalance() + amount));
			setBalance(getBalance() + amount);
	  }
	  
	public void printInformation() {
		System.out.printf("Name : %s\n",  name);
		System.out.printf("Annual interest rate: %.1f\n", getAnnualInterestRate());
		System.out.printf("Balance: %.1f\n",  getBalance());
		System.out.printf("%-35s%-15s%-10s%-10s\n", "Date", "Type", "Amount", "Balance");
		for(int i = 0; i<transactions.size(); ++i) {
			System.out.printf("%-35s%-15c%-10.1f%-10.1f\n", transactions.get(i).getDate(), transactions.get(i).getType(), transactions.get(i).getAmount(), transactions.get(i).getBalance());
		}
	}
}