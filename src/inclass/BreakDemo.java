package inclass;

public class BreakDemo {

	public static void main(String[] args) {
		
		for(int i = 0; i<=5; i++) {
			if(i==3) {
				break; //exits out of the loop
			}
			System.out.println(i);
		}
		System.out.println(" Exited from loop because i = 3");

	}

}
