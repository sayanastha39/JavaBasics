package javabasic;

public class MethodHW {
	
	public static void findFactorial(int n) {
		for (int i =1; i<=n; i++) {
			if ((n%i) == 0){
				System.out.print(i + " ");
			}
		}
	}
	
	public static void printTable(int n) {
		for (int i =1; i<=10; i++) {
			int table = i*n;
			System.out.println(n+ " * "+ i+ " ="+ table);
			
		}
	}
	
	public static void nthSum(int n) {
		int sum =0;
		
		for(int i=0; i<=n; i++) {
			sum = (i*(i+1))/2;
		}
		System.out.println("Sum 1 to nth natural numbers is: " +sum);
	}
	
	public static void reverse(int number) {
		int reversed =0;
		while(number!=0) {
			int digit = number%10;
			reversed = (reversed*10)+digit;
			number = number/10;
		}
		System.out.println(reversed);
	}
	
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
	
	public static void findFibonacci(int a) {
		int n1=0,n2=1,n3,i,count=11;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 } 
	}
}
