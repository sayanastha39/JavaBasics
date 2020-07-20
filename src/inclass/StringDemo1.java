package inclass;

public class StringDemo1 {

	public static void main(String[] args) {
		
		//same litera value so will be assigned in same object id
		String s1 = "Nepal";
		String s2 = "Nepal";
		
		String s3 =  new String("Nepal");
		String s4 =  new String("Nepal");
		
		//here it is comparing object ids
		System.out.println(s1==s2); //true
		System.out.println(s1== s3);//false
		System.out.println(s4== s3);//false
		
		System.out.println(s1.equals(s3)); //true here checking value
	}

}
