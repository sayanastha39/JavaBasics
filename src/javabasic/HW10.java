package javabasic;

import java.util.Scanner;

public class HW10 {

	public static void main(String[] args) {
		//Mathematical Function
		
		Scanner input  = new Scanner(System.in);
		System.out.println("u: ");
		double u = input.nextDouble();
		System.out.println("t: ");
		double t = input.nextDouble();
		System.out.println("a: ");
		double a = input.nextDouble();
		
		double s = (u*t) + (1/2*(a*t*t));
		
		System.out.println("s1: ");
		double s1 = input.nextDouble();
		System.out.println("s2: ");
		double s2 = input.nextDouble();
		System.out.println("s3: ");
		double s3 = input.nextDouble();
		
		double area = Math.sqrt((s*(s-s1))*(s*(s-s2))*(s*(s-s3)));
		
		System.out.println("speed is: " + s);
		System.out.println("area is: "+ area);

	}

}
