package Multithreading;

public class ThreadDemo4 extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() );
	}

	public static void main(String[] args) {
		ThreadDemo4 t1 = new ThreadDemo4();
		ThreadDemo4 t2 =  new ThreadDemo4();
		ThreadDemo4 t3 =   new ThreadDemo4();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}

}
