package SayanaLab1;

import java.util.Scanner;

public class BankAccountRun {

	public static void main(String[] args) {
		
		
		BankAccount RamAcc = new BankAccount("Ram",2000);
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to open an account or withdraw or deposit? ");
		String choice = input.next(); 
		
		switch(choice) {
		
		case "open":
			RamAcc.displayInfo();
			break;
			
		case "withdraw":
			RamAcc.withdrawFund(200, 2);
			break;
		
		case "deposit":
			RamAcc.depositFund(500,4);
			break;
		default:
			System.out.println("Wrong input");
			break;
		}
		input.close();
	}

}
