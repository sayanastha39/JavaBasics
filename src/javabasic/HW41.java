package javabasic;

import java.util.Scanner;

///find the duplicate letter in a word.
public class HW41 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter the word to find the duplicate letter in a word. ");
		String word = input.next();
		
		for (int i = 0; i<word.length(); i++) {
			for(int j=i+1; j<(word.length()); j++){
				
				if(word.charAt(i)==(word.charAt(j))) {
					System.out.println("The duplicate letter is: " +word.charAt(i) );
				}
			}
		}

	}

}
