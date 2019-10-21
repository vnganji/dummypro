package Inheritance;

public class classB extends classA {

	int x = 45;
	
	private int p = 46;
	static int s = 47;
	
	public classB() {
		super("venkat");
		System.out.println("Child Class constructor");
		
	}

	public static void main(String[] args) {

		classB b = new classB();
		b.accessVar();
		

	}
	
	public void instance(){
		System.out.println("instance method in child");
	}
	

	public void accessVar() {

		int x = 9;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		this.instance();
		super.instance();

	}

}
