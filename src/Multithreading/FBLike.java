package Multithreading;

public class FBLike {
	
	int likes;
	
	public FBLike(int likes) {
		this.likes = likes;
	}

	//if we don't write synchronize all thread will access at once
	public synchronized void incrementLikes() {
		likes++;
		
		try {
			Thread.sleep(1000);
			System.out.println(likes);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
