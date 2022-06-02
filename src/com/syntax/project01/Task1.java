package com.syntax.project01;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*Using Scanner create an array of integer values.
		 *After the array is created,
		 *calculate the sum of all stored elements in that array.
		 */	
				Scanner scan=new Scanner(System.in);
				int[] array=new int[5];
				int sum=0;
				
				System.out.println("Please enter five numbers");
				for(int i=0; i<array.length; i++) {
					array[i]=scan.nextInt();}
					
					for(int i=0; i<array.length; i++) {
						sum+=array[i];}
					
				System.out.println("Sum of all numbers you entered is "+sum);
			

	}

}
