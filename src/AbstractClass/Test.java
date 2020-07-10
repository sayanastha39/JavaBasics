package AbstractClass;

public class Test {

	public static void main(String[] args) {
		
		Circle cir =  new Circle();
		cir.draw();
		
		System.out.println("=============");
		
		Triangle tri = new Triangle();
		tri.draw();
		tri.paint(); 
		
		System.out.println("=============");
		Shape shape; //Shape shape = new Shape(); can't be done as we can't instantite abstarct class
		shape = new Triangle();
		shape.draw();
		
	}
	

}
