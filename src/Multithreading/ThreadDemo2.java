package Multithreading;

public class ThreadDemo2 implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Hello from runnable thread run method");
	}

	public static void main(String[] args) {
		ThreadDemo2 t1 = new ThreadDemo2();
		Thread tt1 = new Thread(t1);
		ThreadDemo2 t2 =  new ThreadDemo2();
		Thread tt2 = new Thread(t2);
		ThreadDemo2 t3 =   new ThreadDemo2();
		Thread tt3 = new Thread(t3);
		tt1.start();
		tt2.start();
		tt3.start();
	}

	

}
