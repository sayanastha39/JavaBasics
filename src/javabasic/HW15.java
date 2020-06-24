package javabasic;

import java.util.Scanner;

public class HW15 {

	public static void main(String[] args) {
		//receives an ASCII code (between 0 – 128) and display its character 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code");
		int a = input.nextInt();
		System.out.println("The character value of ASCII " + a +" to char is " + (char)a);
		
	}

}
