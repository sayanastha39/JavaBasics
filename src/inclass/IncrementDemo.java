package inclass;

public class IncrementDemo {
	
	public static void main(String[] args) {
		
		int a = 3;
		System.out.println (a);
		
		//pre increments
		++a;
		System.out.println (a); //4
		
		System.out.println ("============");
		
		//pre: increment then operation
		//post: operation then increment
		int x= 7;
		System.out.println (x); //7
		System.out.println (++x); //8 pre so will increment first then does operation 
		System.out.println (x++); //8 in post will print first then adds now in next line x=9
		System.out.println (++x); //10  in pre will add first so 10
		
		System.out.println ("============");
		
		int i =4;
		int j = i++; //operation then increment
		System.out.println (j); //4
		System.out.println (i); //5
		
		System.out.println ("============");
		
		int m =5;
		 m= (m++) + (++m) +m +1;
		  //5  +   7  + 7 +1 
		 System.out.println (m); //20
		 
		 System.out.println ("============");
			
			int n =7;
			 n= (++n) + (n++) +n +1;
			  //8  +   8  + 9 +1 
			 System.out.println (n); //26
			 
		
		
	}

}
