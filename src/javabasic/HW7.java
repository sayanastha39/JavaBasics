package javabasic;

import java.util.Scanner;

public class HW7 {

	public static void main(String[] args) {
		//  read the radius and length of a cylinder and computes volume.
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter radius for CYLINDER: ");
		double r = input.nextDouble();
		
		System.out.println ("Enter height for rectangle: ");
		int h = input.nextInt();
		
		double cylinder = Math.PI* h* r*r;
		System.out.println ("Volume of cylinder is : " + cylinder);
		
		
	}

}
