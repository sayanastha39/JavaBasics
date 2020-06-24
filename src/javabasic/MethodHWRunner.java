package javabasic;

import java.util.Scanner;

public class MethodHWRunner {

	public static void main(String[] args) {
		
		MethodHW run = new MethodHW();
		Scanner input = new Scanner(System.in);
		String decision = "";
		
		do {
			System.out.println("What operation do you want to carry out?");
			String choice = input.next();
			
			switch(choice) {
				case "factorial":
					System.out.println("Enter the number you want to find factorial of: ");
					int n = input.nextInt();
					run.findFactorial(n);
					break;
				case "table":
					System.out.println("Enter the number you want to find table of: ");
					 n = input.nextInt();
					run.printTable(n);
					break;
				case "nthSum":
					System.out.println("Enter the number you want to find nthSum of: ");
					 n = input.nextInt();
					run.nthSum(n);
					break;
				case "reverse":
					System.out.println("Enter the number you want to find reverse of: ");
					 n = input.nextInt();
					run.reverse(n);
					break;
				case "isPrimenumber":
					System.out.println("Enter the number you want to find if it is prime: ");
					 n = input.nextInt();
					run.isPrimenumber(n);
					break;
				case "fibonacci":
					System.out.println("Enter the number you want to find if it is prime: ");
					 n = input.nextInt();
					run.findFibonacci(n);
					break;
				default :
					System.out.println("Wrong input");
					break;
			}
				System.out.println("Do you want to continue?");
				decision = input.next();
			}
		
		while(decision.equalsIgnoreCase("yes"));
		System.out.println("Thank you, bye!");
		input.close();
	}

}
