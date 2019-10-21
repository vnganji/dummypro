package variables;

public class Wrapper {
	
	//int -- Integer -- Number ---Object
	
	
	public static void main(String[] args) {
		int i =10;
		Integer j =10;
		System.out.println(j.floatValue());
		
		Object o = 20;
		Integer k = (Integer)o;//downcasting
		
		Integer kk = 30;
		Number jj = kk; //Upcaasting
		
		Integer mm = kk;
		
		
		
		
	}
	

}
