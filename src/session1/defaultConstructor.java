package session1;

public class defaultConstructor {
	
	int empno;
	String name ;
	
	public defaultConstructor(){
		
		this.empno=100;
		this.name="venkat";
	
	}
	
public defaultConstructor(int empno, String name){
		
		this.empno=200;
		this.name="siddu";
	
	}
	public static void main(String[] args) {
		
		defaultConstructor dc= new defaultConstructor();//Invoking Default Constructor
		System.out.println(dc.empno);
		System.out.println(dc.name);
		
		defaultConstructor dc1= new defaultConstructor(200,"siddu");//Invoking parmeterized  Constructor
		System.out.println(dc1.empno);
		System.out.println(dc1.name);
	}

}
