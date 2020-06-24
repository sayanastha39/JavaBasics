package javabasic;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		
		// area of circle, rectangle, and triangle.
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter radius for circle: ");
		double r = input.nextDouble();
		
		System.out.println ("Enter length for rectangle: ");
		int l = input.nextInt();
		System.out.println ("Enter breadth for rectangle: ");
		int b = input.nextInt();
		
		System.out.println ("Enter breadth for triangle: ");
		int b1= input.nextInt();
		System.out.println ("Enter height for triangle: ");
		int h= input.nextInt();
		
		double circle = Math.PI* (r*r);
		
		int rectangle = l*b;
		
		int triangle = (b1*h)/2;
		
		System.out.println ("Area of circle is : " + circle);
		System.out.println ("Area of triangle is : " + triangle);
		System.out.println ("Area of rectangle is : " + rectangle);
		
	}

}
