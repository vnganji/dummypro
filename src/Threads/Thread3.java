package Threads;

public class Thread3 {
	
	//Creating Anonymous inner class and implementing thread
	public static void main(String[] args) {
		
		Thread t1=new Thread() {
			public void run() {
				for (int i = 1; i<5; i++) {
				System.out.println(i*5);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			}
		};
		Thread t2 = new Thread(new Runnable()
				{ public void run() {
					
					for (int i = 1; i<5; i++) 
						System.out.println(i*10);
				}
			
				});
		Runnable R = new Runnable() {
			public void run() {
			for (int i = 1; i<5; i++) 
				System.out.println(i*15); }
			
		};
		t1.start();
		t2.start();
		Thread t3= new Thread(R);
		t3.start();
		
	}


}
