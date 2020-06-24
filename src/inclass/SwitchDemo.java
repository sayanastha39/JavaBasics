package inclass;

public class SwitchDemo {

	public static void main(String[] args) {
	
		//if no break then the case later match will also run even if not met
		String option = "apple";
		
		switch(option) {
		case "apple": 
			System.out.println("LOWER");
//			break;
		case "Apple": 
			System.out.println("CAMEL");
//			break;
		case "APPLE": 
			System.out.println("UPPER");
//			break;
		default: 
			System.out.println("wrong");
			break;
		
		}
			
	}

}
