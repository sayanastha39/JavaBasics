package javabasic;

import java.util.Scanner;

public class HW25 {

	public static void main(String[] args) {
		// enter the number of students and each student’s name and score to display highest score.
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of students: ");
		int number = input.nextInt();
		
		int highscore = 0;
		String name = "";
		
		for (int i=1; i<=number; i++) {
			System.out.println("Enter the name of the students: ");
		    name = input.next();
			System.out.println("Enter the score of students: ");
			int score = input.nextInt();
			if (score>highscore) {
				highscore = score;
			}
		}

		System.out.println("Student " + name + " has the highest score of " +  highscore);
	}

}
