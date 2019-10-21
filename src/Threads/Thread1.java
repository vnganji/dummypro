package Threads;

public class Thread1 extends Thread{
	
	//thread can be implemented in 2 ways
	//by extending thread class and implements Runnable
	//life cycle of thread
	//new = when you first create thread it will be new
	//start = when you start...it will be created new call stack and it will runnable state
	//run = Thread scheduler will pick up and make it running
	//non runnable : when thread gets interrupted it will  be non runnable
	//when it finishes wiat ..again it will back to runnable state
	
	public Thread1(String name) {
		super(name);
	}
	
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1("threadobj");
		t1.start();
		
	}
	
	public void run() {
		for (int i = 0; i<5 ; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
