package innerclass;

public class innercls {
	
	public static void main(String[] args) {
		
		class1 inrc = new class1() {
			
			public void inner() {
				System.out.println("Inner class in innerclass");}};
			
			innerinterface in = new innerinterface() {

				@Override
				public void abs() {
					System.out.println("Interface Implementation");
					
				}
			
				
			};
			
		
		
		inrc.inner();
		in.abs();
	}

}
