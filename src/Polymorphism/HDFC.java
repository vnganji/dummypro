package Polymorphism;

public class HDFC extends Bank {

	public static void main(String[] args) {
		Bank B1 = new HDFC();//Polymormphic Reference
		B1.returnintRate();
	}

	/*public double returnintRate() {

		return 8.4;

	}*/

}
