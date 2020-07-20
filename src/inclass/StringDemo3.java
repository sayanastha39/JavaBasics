package inclass;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String s1 = "hello";
		System.out.println(s1); //hello
		
		s1.concat("nepal");
		System.out.println(s1);//hello cuz object s1 has hello and if something new we need to reassign or assign in diff obj
		
		s1 = s1.concat(" nepal");
		System.out.println(s1); //hello nepal
		
		String s2= s1.concat("!");
		System.out.println(s2); //hello nepal!
		
		
	}

}
