package SayanaLab1;

public class BankAccount {
	
	 private String name;
	 private double initialBalance;
	 private int accountNum;
	 private static int accountNumber = 1000;
	 int fee;
	 int interest;
	 
	public BankAccount(String name) {
		this.name= name;
		this.initialBalance = 0;
		this.accountNum=accountNumber++;
		displayInfo();
		
	}
	
	public BankAccount(String name, double initialBalance ) {
		this.name= name;
		this.initialBalance = initialBalance;
		this.accountNum= accountNumber++;
		displayInfo();
	}
	
	public void depositFund(double amount) {
		initialBalance = initialBalance+ amount;
		displayInfo();
		
	}
	public void depositFund(double amount, double interest) {
		initialBalance = initialBalance+
				(interest* initialBalance/100)+ amount;
		displayInfo();
	}
	
	
	public void withdrawFund(double amount) {
		initialBalance = initialBalance- amount;
		displayInfo();
	}
	
	public void withdrawFund(double amount, double fee) {
		initialBalance = initialBalance- amount-fee; 
		displayInfo();
	}
	
	public void displayInfo() {
		System.out.println("====================");
		System.out.println("Account name is: "+ name);
		System.out.println("Account number is: "+ accountNum );
		System.out.println("Initial Balance is: "+ initialBalance);
		System.out.println("====================");
	}
	
}
