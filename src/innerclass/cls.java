package innerclass;

public class cls extends class1  {
	
	public static void main(String[] args) {
		class1 a1 = new cls(); //normal implementation of override method;
		a1.inner();	
			
		
		
	}
	public void inner() {
		System.out.println("Inner class in extended class");}
	
	
}

