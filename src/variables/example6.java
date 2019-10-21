package variables;

public class example6 {
	
	static int counter = 10;
	
	public example6(){
		counter++;
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		example6 ex6 = new example6();
	}
	

}
