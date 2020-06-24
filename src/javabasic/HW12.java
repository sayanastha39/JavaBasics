package javabasic;

import java.util.Scanner;

public class HW12 {

	public static void main(String[] args) {
		//display roll, name, and nationality 
		Scanner input = new Scanner(System.in);
		System.out.println("Name: ");
		String name = input.nextLine();
		System.out.println("Nationality: ");
		String nationality = input.nextLine();
		System.out.println("Roll: ");
		int roll = input.nextInt();
		
		System.out.println("Name is: "+ name);
		System.out.println("Nationality is: "+ nationality);
		System.out.println("Roll is: "+ roll);

	}

}
