package LOOPS;

public class ifLoop {
	
	public static void main(String[] args) {
		
		int age = 14;
		boolean voteExists=true;
		 if (age>=18){
			 System.out.println("Major");}
		 else{
			 System.out.println("minor");}
		
		 if (age>=18){
			 System.out.println("Major");
			 if (voteExists)
			 System.out.println("yes vote exists");
			 else
				 System.out.println(" vote doesnt exists");	 
		 }	
			 
		 else{
			 System.out.println("minor");}
	}

}
