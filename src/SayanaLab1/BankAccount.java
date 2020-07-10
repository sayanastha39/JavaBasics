package SayanaLab1;

public class BankAccount {
	
	 String name;
	 double balance;
	 int accountNumber;
	 int fee;
	 int interest;
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BankAccount(String name) {
		accountNumber = this.accountNumber;
		balance= 0.0;
	}
	
	public BankAccount(String name, double balance ) {
		accountNumber = this.accountNumber;
		
	}

	public void withdrawFunds(double balance, int fee) {
		
		balance = this.balance - fee;
		
	}
	
	public void depositFunds(double balance, int interest) {
		
		balance = balance+ ((interest/100)*balance);
		
	}
	
	public void DisplayAccountInfo() {
		System.out.println("Account number: "+ accountNumber);
		System.out.println("Balance: "+ balance );
		
	}

}
