package Multithreading;

public class ThreadDemo1 extends Thread {
	
	@Override
	public void run() {
		System.out.println("Hello from thread run method");
	}
	
	public static void main(String[] args) {
		
		ThreadDemo1 t1 = new ThreadDemo1();
		ThreadDemo1 t2 =  new ThreadDemo1();
		ThreadDemo1 t3 =   new ThreadDemo1();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
