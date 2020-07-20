package javabasic;

import java.util.Scanner;

//check whether given string is palindrome or not.
public class HW38 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter the word to check whether it is palindrome or not: ");
		String word = input.nextLine();
		String rev = "";
		for (int i =( word.length()-1); i>=0; i--) {
			rev += word.charAt(i);
			
		}
		System.out.println(rev);
		
		if (rev.equals(word)){
			System.out.println("Given word is palindrome");
		}
		else {
			System.out.println("Given word is not palindrome");
		}
	}

}
