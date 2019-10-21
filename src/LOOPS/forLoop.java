package LOOPS;

public class forLoop {

	public static void main(String[] args) {
		
		
		//for loop with break
		for (int i=0; i<=25; i++){//made some changes by asa team developer 1
			for (int j = 0 ; j<=5; j++){
				if (i==2 & j==2)
					break; //come out of internal for loop
				System.out.print(i);
				System.out.println(j);
			}
		}
		
		
		System.out.println("for loop with continue");
		for (int i=0; i<=5; i++){
			for (int j = 0 ; j<=5; j++){
				if (i==2 & j==2)
					continue; //come out of internal for loop
				System.out.print(i);
				System.out.println(j);
			}
		}
	}
}
