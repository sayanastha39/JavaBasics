package Multithreading;

public class FBLikeTest {

	public static void main(String[] args) {
		//initial like is 100
		FBLike fb= new FBLike(100);
		
		Thread user1 = new Thread(()->{
			fb.incrementLikes();
		});
		
		Thread user2 = new Thread(()->{
			fb.incrementLikes();
		});
		
		Thread user3 = new Thread(()->{
			fb.incrementLikes();
		});
		
		user1.start();
		user2.start();
		user3.start();
		

	}

}
