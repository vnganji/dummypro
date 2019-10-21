package variables;

public class Example5 {
	
	int i =10;
	static int j = 20;
	
	public static void main(String[] args) {
		
		Example5 ex = new Example5();
		System.out.println(j);
		System.out.println(ex.i);
		System.out.println(ex.j);
		j++;
		System.out.println(ex.j);
		ex.method2();
		
	}
	
	public void method1(){
		
		
		System.out.println("method1");
	}
	
	public  void method2(){
		method1();
		System.out.println("method2");
		
	}

}
