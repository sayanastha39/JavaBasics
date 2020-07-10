package inclass;

public class ObjectDemo {
	
	//DAY 15

	public static void main(String[] args) {
		ObjectDemo ob1 = new ObjectDemo();
		ObjectDemo ob2 = ob1;
		//here ob1 and b2 have same object id
		
		System.out.println("ob1 " + ob1);
		System.out.println("ob2 " + ob2);
		
		System.out.println("=============");
		
		//now ob1 will have diff object id when we create new object
		
		ob1 = new ObjectDemo();
		//ob2 = ob1; //if we did this then we'd have new object id for obj2 as well
		System.out.println("ob1 " + ob1); //new object id
		System.out.println("ob2 " + ob2); //same old object id as it is still referencing to old one
	}

}
