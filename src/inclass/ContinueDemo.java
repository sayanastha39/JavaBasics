package inclass;

public class ContinueDemo {

	public static void main(String[] args) {
		
		//continue so it will still continue the whole for loop but just breaks from the part where if condition met
		for (int i=0; i<=5; i++) {
			if(i==3) {
				continue; //if i=3; will skip rest  of the code
			}
			System.out.println(i);// if i=3; will skip this part
		}
		System.out.println("Exited for loop using continue");
		
		
		//stops totally after the condition met
		for (int j=0; j<=5; j++) {
			if(j==3) {
				break; 
			}
			System.out.println(j);
		}
		System.out.println("Exited for loop using break ");
	}

}
