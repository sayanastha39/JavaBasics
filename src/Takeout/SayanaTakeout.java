package Takeout;

import java.util.Scanner;

public class SayanaTakeout {
	
	static Scanner input = new Scanner (System.in);
	static String foodType;
	static int people;
	static String tray;
	static int feeds;
	static double foodcost;
	static double taxrate = 0.07;
	static double tipRate = 0.15;
	static double tips;
	static double taxAmount;
	static double pricePerPerson;
	static int leftover;
	static double grandTotal;
	static int trays;
	static int totalTrays;
	static int totalFood;
	
	
	public static void displayMainMenu() {
		System.out.println("How many people are ordering?");
		people = input.nextInt();
	}
	
	public static void displayItalianFoodMenu() {
		System.out.println("Which food tray do you want to order; choose meat type?");
		System.out.println("1. Lasagna Tray - Feeds 5 - 17.99\n" + 
							"2. Pizza Pack - Feeds 7 - 15.99\n" + 
							"3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");
		 tray = input.next(); //next line because more than one word next() if only one work input
	}
	
	public static void displayChineseFoodMenu() {
		System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99\n" + 
				"2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99\n" + 
				"3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99");
		 tray = input.next();
	}
	public static void displayAmericanFoodMenu() {
		System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99\n" + 
				"2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 -\n" + "22.99\n" + 
				"3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99");
		 tray = input.next();
		
		
		}

	
	public static int determineTrays(int people, int feeds) {
		totalTrays = (people/feeds);
		 System.out.println("Total trays of food needed is: "+totalTrays );
		return totalTrays;
	}
	
	public static double getSubtotal(double cost, int totalTrays) {
		
		 foodcost = cost * totalTrays;
		System.out.println("Total cost is "+ foodcost);
		return foodcost;
	}
	public static int determineLeftOvers(int feeds, int totalTrays, int people) {
		 totalFood = feeds * totalTrays;
		 leftover = totalFood - people;
		System.out.println("The leftover food is "+ leftover);
		return leftover;
	}
	
	public static double getTax(double cost, double taxrate) {
		
		 taxAmount = taxrate*cost;
		System.out.println("Tax amount is : "+ taxAmount);
		return taxAmount;
	}
	
	public static double getTip(double cost, double tipRate) {
		  tips = tipRate*cost;
		System.out.println("Tips amount is : "+ tips);
		return tips;
	}
	
	public static double getGrandTotal(double foodcost, double taxAmount, double tips) {
		 grandTotal = foodcost+ taxAmount+ tips;
		System.out.println("Total cost including tax and tips is: "+ grandTotal);
		return grandTotal;
	}
	public static double pricePerPerson(double grandTotal, int people) {
		double pricePerPerson = grandTotal/people;
		System.out.println("Price per person is: "+ pricePerPerson);
		return pricePerPerson;
	}
}
