package inclass;

public class DataType {
	public static void main(String[] args) {
		
		byte b1 = 127; //max byte can hold
		byte b2 = -127; //min range
		
		long l1 = 9223372036854775807L; //L at the end so that compiler does not convert it to int and same for float and double
		long l2= -9223372036854775807L;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.BYTES);
		System.out.println(Byte.SIZE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.BYTES);
		System.out.println(Long.SIZE);
		
		//Boolean literal
		boolean bb1 =true;
		boolean bb2 =false;
		
		//Character literal
		char c1 = 'a';
		char c2 = '?';
		char c3 = '1';
		char c4 = '\u0000'; // unicode of 0
		char c5= 65535;
		
		//null literal
		String s1 = null; //anything that has value null is null literal
	}
}
