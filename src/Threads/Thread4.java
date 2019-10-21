package Threads;

public class Thread4 {
	
static Runnable R = new Runnable() {

	@Override
	public void run() {
		for (int i = 1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());  
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
};

public static void main(String[] args) throws InterruptedException {
	
	Thread t1 = new Thread(R);
	t1.start();
	t1.join(1500);//wait for 1500 milliseconds for the thread to die
	Thread t2 = new Thread(R);
	t2.start();
	Thread t3 = new Thread(R);
	t3.start();
	
	
}

}
