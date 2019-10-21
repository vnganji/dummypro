package Inheritance;

public class classA {
	
	int x = 111;
	private int p = 222;
	static int s = 333;
	final static int f = 444;
	
	
	/*public classA() {
		System.out.println("parent class constructor ");
	}*/
	public classA(String name) {
		System.out.println("parent class constructor "+name);
	}
	
	public static void main(String[] args) {
		
		
	}
	
	public void instance(){
		System.out.println("instance method in parent");
	}
	
	public static void stat(){
		System.out.println("static method in parent");
	}
	}


