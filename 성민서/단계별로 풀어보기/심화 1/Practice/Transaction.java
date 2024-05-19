public class Transaction{
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	
	Transaction(){
	}
	
	Transaction(char type, double amount, double balance){
		this.date = new java.util.Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	
	char getType() {
		return type;
	}
	java.util.Date getDate(){
		return date;
	}

	double getAmount() {
		return amount;
	}
	double getBalance() {
		return balance;
	}
}