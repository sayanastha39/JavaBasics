package inclass;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		
		boolean flag = true;
		Scanner input = new Scanner(System.in);
		
		
		//infinite loop unless name is Santosh
		while(flag){
			System.out.println("Enter name: " );
			String name = input.next();
			//if (!name.equals("santosh")) {
			if (name.equals("santosh")) {
				flag = false;
			}
			System.out.println("Name is " + name);
			
		}
		
		System.out.println("Exited loop");
		input.close();

	}

}
