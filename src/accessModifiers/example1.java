package accessModifiers;

public class example1 {

	public static void main(String[] args) {
		
		example1 ex1 = new example1();
		ex1.DefaultMethod();
		ex1.ProtectedMethod();
		ex1.PrivateMethod();
		ex1.publicMethod();

	}

	// public method
	public void publicMethod() {

		System.out.println("I am public method in enample1 of package Accessmodifiers");
	}

	// private method
	private void PrivateMethod() {

		System.out.println("I am private method in enample1 of package Accessmodifiers");
	}

	// default method
	void DefaultMethod() {

		System.out.println("I am Default method in enample1 of package Accessmodifiers");
	}

	// protected method
	protected void ProtectedMethod() {

		System.out.println("I am protected method in enample1 of package Accessmodifiers");
	}

}
