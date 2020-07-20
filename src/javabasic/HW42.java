package javabasic;

import java.util.Scanner;

//find the duplicate word from long string.
public class HW42 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter the sentence to find the duplicate word in the sentence. ");
		String line = input.nextLine();
		String [] arrOfStr = line.split(" ");
		
		for (int i = 0; i<arrOfStr.length; i++) {
			for(int j=i+1; j<(arrOfStr.length); j++){
				
				if(arrOfStr[i].equals(arrOfStr[j])) {
					System.out.println("The duplicate word is: " +arrOfStr[i] );
				}
				
			}
					
		}
		
	}

}
