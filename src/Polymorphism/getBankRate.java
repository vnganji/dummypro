package Polymorphism;

public class getBankRate {
	
	public static void main(String[] args) {
		
		Bank B1 = new HDFC();//Polymormphic Reference
		System.out.println(B1.returnintRate());
		
		
	}

}
