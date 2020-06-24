package javabasic;

import java.util.Scanner;

public class HW28 {
	//Prime functions
	
	//isPrimenumber(int)
	public static void isPrimenumber(int a) {
		boolean flag = false; //prime then false
		
		for(int i = 2; i <= a/2; ++i) {
            // condition for nonprime number
            if(a % i == 0)
            {
                flag = true; //non prime
                break;
            }
        }
        if (!flag)
            System.out.println(a + " is a prime number.");
        else
            System.out.println(a + " is not a prime number.");
	}
	
	//firstNthPrime
	public static void firstNthPrime(int a) {
		
    int status = 1;
    int num = 3;
    
    if (a >= 1)
    {
       System.out.println("First "+a+" prime numbers are:");
       //2 is a known prime number
       System.out.println(2);
    }

    for ( int i = 2 ; i <=a ;  )
    {
       for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
       {
          if ( num%j == 0 )
          {
             status = 0;
             break;
          }
       }
       if ( status != 0 )
       {
          System.out.println(num);
          i++;
       }
       status = 1;
       num++;
    } 
	}
	
	//allPrimebetween(int start , int  end)
	public static void allPrimebetween(int low, int high) {
		while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = input.nextInt();
		System.out.println("Enter the end number");
		int m = input.nextInt();
		HW28.isPrimenumber(n);
		HW28.firstNthPrime(n);
		HW28.allPrimebetween(n, m);
	}

}
