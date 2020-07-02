package Takeout;

import java.util.Scanner;

public class SayanaTakeoutRunner {

	public static void main(String[] args) {
		
	SayanaTakeout obj = new SayanaTakeout();
	
	obj.displayMainMenu();
	if(obj.people<100) {
		System.out.println("What type of food will you order?");
		System.out.println("1. Italian\n" + "2. Chinese\n" + "3. American");
		 obj.foodType = obj.input.next();
		
		if(obj.foodType.equalsIgnoreCase("Italian")) {
			obj.displayItalianFoodMenu();
			
				if(obj.tray.equalsIgnoreCase("Lasagna")) {
					double cost = 17.99;
					int feeds = 5;
					obj.determineTrays(obj.people, feeds);
					obj.getSubtotal(cost,obj.totalTrays);
					obj.getTax(cost, obj.taxrate);
					obj.getTip(cost, obj.tipRate);
					obj.getGrandTotal(cost, obj.taxAmount, obj.tips);
					obj.pricePerPerson(obj.grandTotal, obj.people);
					obj.determineLeftOvers(feeds,obj.totalTrays, obj.people);
				}
				else if(obj.tray.equalsIgnoreCase("Pizza")) {
					double cost = 15.99;
					int feeds = 7;
					obj.determineTrays(obj.people, feeds);
					obj.getSubtotal(cost,obj.totalTrays);
					obj.getTax(cost, obj.taxrate);
					obj.getTip(cost, obj.tipRate);
					obj.getGrandTotal(cost, obj.taxAmount, obj.tips);
					obj.pricePerPerson(obj.grandTotal, obj.people);
					obj.determineLeftOvers(feeds,obj.totalTrays, obj.people);
				}
				else if(obj.tray.equalsIgnoreCase("Salad")) {
					double cost = 12.99;
					int feeds = 4;
					obj.determineTrays(obj.people, feeds);
					obj.getSubtotal(cost,obj.totalTrays);
					obj.getTax(cost, obj.taxrate);
					obj.getTip(cost, obj.tipRate);
					obj.getGrandTotal(cost, obj.taxAmount, obj.tips);
					obj.pricePerPerson(obj.grandTotal, obj.people);
					obj.determineLeftOvers(feeds,obj.totalTrays, obj.people);
				}
				else {
					System.out.println("Invalid tray");
				}
		}
		else if (obj.foodType.equalsIgnoreCase("Chinese")) {
			obj.displayChineseFoodMenu();
			 if(obj.tray.equalsIgnoreCase("Chicken")) {
					double cost = 18.99;
					int feeds = 7;
					obj.determineTrays(obj.people, feeds);
					obj.getSubtotal(cost,obj.totalTrays);
					obj.getTax(cost, obj.taxrate);
					obj.getTip(cost, obj.tipRate);
					obj.getGrandTotal(cost, obj.taxAmount, obj.tips);
					obj.pricePerPerson(obj.grandTotal, obj.people);
					obj.determineLeftOvers(feeds,obj.totalTrays, obj.people);
				}
				else if(obj.tray.equalsIgnoreCase("Pork")) {
					 double cost = 18.99;
					 int feeds = 7;
					obj.determineTrays(obj.people, feeds);
					obj.getSubtotal(cost,obj.totalTrays);
					obj.getTax(cost, obj.taxrate);
					obj.getTip(cost, obj.tipRate);
					obj.getGrandTotal(cost, obj.taxAmount, obj.tips);
					obj.pricePerPerson(obj.grandTotal, obj.people);
					obj.determineLeftOvers(feeds,obj.totalTrays, obj.people);
				}
				else if(obj.tray.equalsIgnoreCase("Shrimp")) {
					double cost = 10.99;
					int feeds = 5;
					obj.determineTrays(obj.people, feeds);
					obj.getSubtotal(cost,obj.totalTrays);
					obj.getTax(cost, obj.taxrate);
					obj.getTip(cost, obj.tipRate);
					obj.getGrandTotal(cost, obj.taxAmount, obj.tips);
					obj.pricePerPerson(obj.grandTotal, obj.people);
					obj.determineLeftOvers(feeds,obj.totalTrays, obj.people);
				}
				else {
					System.out.println("Invalid tray");
				}
		}
		else if (obj.foodType.equalsIgnoreCase("American")) {
			obj.displayAmericanFoodMenu();
			if(obj.tray.equalsIgnoreCase("Hamburger")) {
				double cost = 21.99;
				int feeds = 8;
				obj.determineTrays(obj.people, feeds);
				obj.getSubtotal(cost,obj.totalTrays);
				obj.getTax(cost, obj.taxrate);
				obj.getTip(cost, obj.tipRate);
				obj.getGrandTotal(cost, obj.taxAmount, obj.tips);
				obj.pricePerPerson(obj.grandTotal, obj.people);
				obj.determineLeftOvers(feeds,obj.totalTrays, obj.people);
			}
			else if(obj.tray.equalsIgnoreCase("Chicken")) {
				double cost = 22.99;
				int feeds = 5;
				obj.determineTrays(obj.people, feeds);
				obj.getSubtotal(cost,obj.totalTrays);
				obj.getTax(cost, obj.taxrate);
				obj.getTip(cost, obj.tipRate);
				obj.getGrandTotal(cost, obj.taxAmount, obj.tips);
				obj.pricePerPerson(obj.grandTotal, obj.people);
				obj.determineLeftOvers(feeds,obj.totalTrays, obj.people);
				
			}
			else if(obj.tray.equalsIgnoreCase("Barbeque")) {
				double cost = 26.99;
				int feeds = 10;
				obj.determineTrays(obj.people, feeds);
				obj.getSubtotal(cost,obj.totalTrays);
				obj.getTax(cost, obj.taxrate);
				obj.getTip(cost, obj.tipRate);
				obj.getGrandTotal(cost, obj.taxAmount, obj.tips);
				obj.pricePerPerson(obj.grandTotal, obj.people);
				obj.determineLeftOvers(feeds,obj.totalTrays, obj.people);
			}
			else {
				System.out.println("Invalid tray");
			}
	}
	else {
		System.out.println("Invalid food Type");
	}
	}
	else {
		System.out.println("Number of people are invalid");
	}
	
	}
}
	