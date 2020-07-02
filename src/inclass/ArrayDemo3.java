package inclass;

public class ArrayDemo3 {

	public static void main(String[] args) {
		//using literal if we know the data is fixed
		
		String [] names =  new String[]{"Ram", "Shyam", "Hari"};
		//String [] names =  {"Ram", "Shyam", "Hari"}; 
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
