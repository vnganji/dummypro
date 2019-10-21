package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example1 {
	public static void main(String[] args)  {
		
		try {
			FileInputStream FSO = new FileInputStream("c:\test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not found");
		}
		
		try{
		int a = 10;
				System.out.println(a/0);
				}	catch(Throwable  o ){
					o.printStackTrace();
		System.out.println("denominator should not be zero");}
		
		try{int a1[] = new int[3];
		a1[3]=100;
		}
		catch(ArrayIndexOutOfBoundsException o1){
			System.out.println("Array Index out of bound exception");
				}finally{}

	}}	

