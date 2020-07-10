package SayanaLab1;

import java.util.Scanner;

public class BankAccountRunner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Wahat is your name? ");
		String name = input.next();
		BankAccount obj = new BankAccount(name);

		System.out.println("Do you want to open an account or withdraw or deposit? ");
		String choice = input.next(); 
		
		switch(choice) {
		
		case "open":
			obj.DisplayAccountInfo();
			
		case "withdraw":
			obj.withdrawFunds(obj.balance, obj.fee);
			obj.DisplayAccountInfo();
		
		case "deposit":
			obj.depositFunds(obj.balance, obj.interest);
			obj.DisplayAccountInfo();
		default:
			System.out.println("Wrong input");
			
		}
		input.close();
	}

}
