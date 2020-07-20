package inclass;

public class StringDemo2 {
	
	private String name = "Nepal";
	
	public StringDemo2(String name) {
		this.name  = name;
	}
//	@Override
//	public String toString() {
//		return name;
//	}

	public static void main(String[] args) {
		
		String str = new String("Nepal");
		System.out.println(str); //Nepal because The String class has override the toString method 
		
		StringDemo2 str2 = new StringDemo2("Nepal");
		System.out.println(str2); 
		//will print objectid of str2 because StringDemo2 class hasn't override toString method
		
	}

}
