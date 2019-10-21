package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Example {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(10);
		AL.add(20);
		AL.add(5);
		AL.add(20);
		AL.add(4);
		AL.add(null);
		
		System.out.println("ArrayList size");
		
		System.out.println(AL.size());
		System.out.println("ArrayList printed with for ");
		for (Integer O : AL){
			System.out.println(O);
			
		}
		
		System.out.println("ArrayList printed with Iterator ");
		
		Iterator It1 = AL.iterator();
		while(It1.hasNext()){
			System.out.println(It1.next());
		}
		
		System.out.println("Hash Set");
		HashSet<Integer> HL = new HashSet<Integer>();
		HL.add(10);
		HL.add(20);
		HL.add(20);
		HL.add(5);
		HL.add(null);
		System.out.println("Printing hashset with for loop");
		for (Integer O1 : HL){
			System.out.println(O1);
			
		}
		
		
	}
	
	

}
