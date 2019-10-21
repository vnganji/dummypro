package Interfaces;

public class HDFC implements Bank {

	@Override
	public float returnInt() {
	
		return 8;
	}

	
	public static void main(String[] args) {
		
		Bank b = new HDFC();
		System.out.println(b.returnInt());
		
	}
}
