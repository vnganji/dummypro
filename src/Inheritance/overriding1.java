package Inheritance;

public class overriding1 extends Overriding {

	public static void main(String[] args) {
		
		Overriding o1 = new overriding1();//updcasting
		o1.abc();
		o1.def();

	}

	public void abc() {

		System.out.println("child method");

	}

	public Integer returnnum() {
		return 10;
	}
	
public  static void def(){
		
		System.out.println("child");
	}
	

}
