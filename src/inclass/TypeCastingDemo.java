package inclass;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		//int is bigger than byte
		//Implicit type-casting: smaller into bigger by compiler
		
		byte b =4;
		int i =b;
		
		System.out.println(b);
		System.out.println(i);
		
		
		//Explicit type-casting:  bigger into smaller by programmer
		int i2 = 2;
		byte b2 = (byte)i2; //need to write byte because int is bigger than byte and can't fit int in small byte
		
		System.out.println(b2);
		System.out.println(i2);
		
	}

}
