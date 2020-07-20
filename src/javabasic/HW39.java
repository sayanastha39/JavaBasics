package javabasic;

import java.util.Scanner;
//display name in short form. E.g. Ram Kishore Singh  -> R. k. Singh
public class HW39 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter YOUR NAME: ");
		String name = input.nextLine();
		String [] arrOfStr = name.split(" "); 
		String print= "";
		
	
		//to print array
//		for (String a : arrOfStr) {
//            System.out.println(a);
//		}
		
		for (int i = 0; i<(arrOfStr.length-1); i++) {
			
			print += arrOfStr[i].charAt(0)+ ". " ;
		}
	
		System.out.println(print.toUpperCase()+ arrOfStr[arrOfStr.length-1].toUpperCase() );
	}

}
