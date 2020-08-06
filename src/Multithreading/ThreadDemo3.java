package Multithreading;

public class ThreadDemo3 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello from anonymous thread run method");
			}
		});
		
		t1.start();
		
		Thread t2 = new Thread(()->  
				System.out.println("Hello from lambda anonymous thread run method")
			
		);
		
		t2.start();
		
	}

}
