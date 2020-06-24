package javabasic;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		//find the perimeter of circle, triangle, and rectangle
		
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter radius for circle: ");
		double r = input.nextDouble();
		
		System.out.println ("Enter length for rectangle: ");
		int l = input.nextInt();
		System.out.println ("Enter breadth for rectangle: ");
		int b = input.nextInt();
		
		System.out.println ("Enter side1 for triangle: ");
		int s1= input.nextInt();
		System.out.println ("Enter side2 for triangle: ");
		int s2= input.nextInt();
		System.out.println ("Enter height for triangle: ");
		int h= input.nextInt();
		
		double circle = Math.PI* 2* r;
		int rectangle = 2*(l+b);
		
		int triangle = s1+s2+h;
		
		System.out.println ("Perimeter of circle is : " + circle);
		System.out.println ("Perimeter of triangle is : " + triangle);
		System.out.println ("Perimeter of rectangle is : " + rectangle);
		
		

	}

}
