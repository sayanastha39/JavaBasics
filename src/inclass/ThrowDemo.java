package inclass;

public class ThrowDemo {
	
	public static void vote(int age) {
		
		if(age>=18) {
			System.out.println("can vote");
		}
		else {
			throw new CustomAgeExc("You are underage");
		}
	}

	public static void main(String[] args) {
	
		vote(12);
	}

}
