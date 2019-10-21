package Threads;

public class Thread2 implements Runnable {

	
	//Thread Implementation with Runnable interface
	@Override
	public void run() {
		for (int i = 0 ; i<5 ; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		Thread2 t3 = new Thread2();
		Thread t4 = new Thread(t3,"runnable thread");// constructor with Runnable Interface
		System.out.println(t4.getName());
		t4.start();
	}

}
