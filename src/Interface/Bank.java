package Interface;

import java.util.Scanner;

public class Bank {
	
	public static void open(AccountP account) {
		account.openAccount();
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the type of account you wnat to open: ");
		String choice = input.next();
		AccountP account  = null;
		
		switch(choice) {
		
			case("saving"):
				account = new SavingAccountI();
				break;
			case("checking"):
				account = new CheckingAccountI();
				break;
			default:
				System.out.println("Wrong input");
		}
		
		if(account!=null) {
			Bank.open(account);
		}
		   
		input.close();

	}
}
