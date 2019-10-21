package variables;

public class Array {
	
	public static void main(String[] args) {
		
		int []x=new int[3];
		x[0]=1;
		x[1]=2;
		x[2]=3;
		//for each loop
		for (int a:x){
		System.out.println(a);	
		}
		
		//for loop
		for (int i = 0; i<x.length; i++){
			System.out.println(x[i]);	
			}
	}

}
